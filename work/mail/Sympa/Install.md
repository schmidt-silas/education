# Install Sympa distribution
## Install requirements and create user & group
```
sudo apt install tar gcc perl make -y
```
```
sudo groupadd sympa && sudo useradd -g sympa -c 'Sympa user' -s /sbin/nologin sympa
```

### LINK: https://www.sympa.community/manual/layout.html

## Get and unpack source
```
wget https://github.com/sympa-community/sympa/releases/download/6.2.72/sympa-6.2.72.tar.gz
```
```
tar xzf sympa-6.2*
```
```
cd sympa-6.2.*
```

## Run configure script
```
./configure #./configure --help for more options
```
```
make
```
```
make install
```

# Install dependent modules
## 
```
cpan App::cpanminus
```
! OR !
```
curl -L https://cpanmin.us | perl - --sudo App::cpanminus
```

```
 cd /home/sympa/
```
### Top of source
```
apt-get install libcurl4-gnutls-dev libexpat1-dev gettext libz-dev libssl-dev -y
```
```
cpanm --installdeps --with-recommends .
```
### !!! JA DER PUNKT MUSS SEIN !!!! Befehl starten und Kaffee Pause machen

# Generate initial configuration
```
 sympa config create
```

EXAMPLE OF SYMPA.CONF
    domain mail.example.org
    listmaster your@e-mail.addr.ess,other@email.addr.ess

```
lang pl
```

# Setup database: MySQL or MariaDB

sudo apt-get install libdbd-mysql-perl mariadb-server -y

-------------------------

# Configure system log
```
touch /var/log/sympa.log && chmod 640 /var/log/sympa.log
```
```
echo 'local1.* -/var/log/sympa.log' > /etc/rsyslog.conf
```
```
sympa test syslog
```

# Configure mail server

-------------------------

# Configure HTTP server

-------------------------

# Start mailing list service
```
systemctl start sympa.service
```
```
systemctl status sympa.service
```

# Automate startup
```
touch /etc/systemd/system/sympa.service.d/dependencies.conf
```
```
echo '[Unit]' > /etc/rsyslog.conf
echo 'Requires=mysql.service' > /etc/systemd/system/sympa.service.d/dependencies.conf
echo 'After=mysql.service' > /etc/systemd/system/sympa.service.d/dependencies.conf
```
```
touch /usr/lib/tmpfiles.d/sympa.conf
```
```
echo 'd /run/sympa 0755 sympa sympa -' > /usr/lib/tmpfiles.d/sympa.conf
```
```
systemctl enable sympa.service
```
```
chkconfig sympa on
```


```
systemctl enable sympa.service
systemctl enable apache2.service
systemctl enable postfix.service
```
