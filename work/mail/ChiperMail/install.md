# Installation auf Ubuntu20.04 ARM
## Da Tomcat 9 bei 24.04 nicht mehr in REPO und Tomcat 10 nicht funktioniert!

### https://www.ciphermail.com/documentation/gateway-installation-guide/ubuntu-debian.html
### https://ciphermail.info/download/

sudo apt install postfix -y
## During the installation of Postfix, select “No Configuration”.

sudo apt-get install gpg gzip libsasl2-modules mawk openjdk-11-jre openjdk-11-jre-headless sudo symlinks tar -y
mkdir install_files
cd install_files
wget https://www.ciphermail.info/downloads/djigzo_5.5.3.0g99d2faca_all.deb
wget https://www.ciphermail.info/downloads/ciphermail-core-os-debian_5.5.3.0g99d2faca_all.deb
wget https://www.ciphermail.info/downloads/djigzo-web_5.5.3.0g99d2faca_all.deb
sudo dpkg -i djigzo_5.5.3.0g99d2faca_all.deb ciphermail-core-os-debian_5.5.3.0g99d2faca_all.deb
sudo systemctl enable ciphermail-gateway-backend
sudo apt install postgresql -y

sudo -u postgres createuser -P djigzo
## The database connection, like user, password and database name, is configured in the file /usr/share/djigzo/conf/database/hibernate.connection.xml. The default user, password and database name is set to djigzo. If you select different values, update the hibernate.connection.xml file.
## to use the default database password, select djigzo for the password.

sudo -u postgres createdb --owner djigzo djigzo
psql -h 127.0.0.1 djigzo djigzo < /usr/share/djigzo/conf/database/sql/djigzo.sql
## Use the password which was selected with the createuser command.

sudo cp -b /usr/share/djigzo/conf/system/postfix/main.deb.cf /etc/postfix/main.cf
sudo cp -b /usr/share/djigzo/conf/system/postfix/master.deb.cf /etc/postfix/master.cf

sudo touch /etc/postfix/smtp_client_passwd
sudo postmap hash:/etc/postfix/smtp_client_passwd
sudo newaliases
sudo systemctl restart postfix
sudo dpkg -i djigzo-web_*_all.deb
sudo apt install tomcat9 -y
echo 'JAVA_OPTS="-Djava.awt.headless=true -Xmx128M"' | sudo tee -a /etc/default/tomcat9
sudo chown tomcat:djigzo /usr/share/djigzo-web/ssl/sslCertificate.p12
sudo cp -b /usr/share/djigzo-web/conf/tomcat/server.xml /etc/tomcat9/
echo '<Context docBase="/usr/share/djigzo-web/djigzo.war" />' | \
sudo tee /etc/tomcat9/Catalina/localhost/ciphermail.xml
echo '<Context docBase="/usr/share/djigzo-web/djigzo-portal.war" />' | \
sudo tee /etc/tomcat9/Catalina/localhost/web.xml
sudo cp /lib/systemd/system/tomcat9.service /etc/systemd/system

## Under Security, add the following line to the file /etc/systemd/system/tomcat9.service to allow writing the directory where the TLS certificate is stored:
sudo nano /etc/systemd/system/tomcat9.service
    ReadWritePaths=/usr/share/djigzo-web/ssl/

sudo systemctl daemon-reload
sudo systemctl restart rsyslog
sudo systemctl restart ciphermail-gateway-backend
sudo systemctl restart tomcat9

## SET PASSWD
sudo passwd

### https://<FQDN>:8443/ciphermail
### CipherMail gateway by default uses PAM authentication. 

# CipherMail log via journald

sudo journalctl -u ciphermail-gateway-backend
sudo less /var/log/ciphermail-gateway-backend.log
sudo journalctl -u tomcat9
