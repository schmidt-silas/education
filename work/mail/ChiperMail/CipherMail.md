# Tomcat 10 ist nicht abwähtskompartibel! Tomcat 9 ist NUR bis Ubuntu 22.04 in der Repo verfügbar
# KEIN SUPPORT für ARM64

# DEFAULT_PASSWD djigzo

HOSTNAME=cipher.komm-one.dev

# -----------------------------------------------------------------------------------

sudo apt update
sudo apt full-upgrade -y
sudo debconf-set-selections <<< "postfix postfix/mailname string $HOSTNAME"
sudo debconf-set-selections <<< "postfix postfix/main_mailer_type string 'No Configuration'"
sudo apt-get install --assume-yes postfix -y
sudo apt-get install gpg gzip libsasl2-modules mawk openjdk-11-jre openjdk-11-jre-headless sudo symlinks tar postgresql tomcat9 -y
mkdir install_files
cd install_files
wget https://www.ciphermail.info/downloads/djigzo_5.5.3.0g99d2faca_all.deb
wget https://www.ciphermail.info/downloads/ciphermail-core-os-debian_5.5.3.0g99d2faca_all.deb
wget https://www.ciphermail.info/downloads/djigzo-web_5.5.3.0g99d2faca_all.deb
sudo dpkg -i djigzo_*_all.deb ciphermail-core-os-debian_*_all.deb
sudo systemctl enable ciphermail-gateway-backend
# Default PW: djigzo | Alternativ das PW in /usr/share/djigzo/conf/database/hibernate.connection.xml anpassen !!!
sudo -u postgres createuser -P djigzo
# -----------------------------------------------------------------------------------
# REPLACE PW !! IF NOT DEFAULT (djigzo)
#sudo nano /usr/share/djigzo/conf/database/hibernate.connection.xml
# -----------------------------------------------------------------------------------
sudo -u postgres createdb --owner djigzo djigzo
# Gerade erstelltes postgres PW verwenden
psql -h 127.0.0.1 djigzo djigzo < /usr/share/djigzo/conf/database/sql/djigzo.sql
sudo cp -b /usr/share/djigzo/conf/system/postfix/main.deb.cf /etc/postfix/main.cf
sudo cp -b /usr/share/djigzo/conf/system/postfix/master.deb.cf /etc/postfix/master.cf
sudo touch /etc/postfix/smtp_client_passwd
sudo postmap hash:/etc/postfix/smtp_client_passwd
sudo newaliases
sudo systemctl restart postfix
sudo dpkg -i djigzo-web_*_all.deb
echo 'JAVA_OPTS="-Djava.awt.headless=true -Xmx128M"' | sudo tee -a /etc/default/tomcat9
sudo chown tomcat:djigzo /usr/share/djigzo-web/ssl/sslCertificate.p12
sudo cp -b /usr/share/djigzo-web/conf/tomcat/server.xml /etc/tomcat9/
echo '<Context docBase="/usr/share/djigzo-web/djigzo.war" />' | \
sudo tee /etc/tomcat9/Catalina/localhost/ciphermail.xml
echo '<Context docBase="/usr/share/djigzo-web/djigzo-portal.war" />' | \
sudo tee /etc/tomcat9/Catalina/localhost/web.xml
sudo cp /lib/systemd/system/tomcat9.service /etc/systemd/system
sudo nano /etc/systemd/system/tomcat9.service
# -----------------------------------------------------------------------------------
# Füge die untere Zeile unter dem Reiter Security ein !!!!
# --> ReadWritePaths=/usr/share/djigzo-web/ssl/
# -----------------------------------------------------------------------------------
sudo systemctl daemon-reload
sudo systemctl restart rsyslog
sudo systemctl restart ciphermail-gateway-backend
sudo systemctl restart tomcat9

# SET PASSWD
sudo passwd
# -----------------------------------------------------------------------------------

# LOGS
sudo journalctl -u ciphermail-gateway-backend
sudo less /var/log/ciphermail-gateway-backend.log
sudo journalctl -u tomcat9