# SERVER aussführen
sudo apt install letsencrypt -y
sudo certbot certonly --standalone --agree-tos --preferred-challenges http -d cipher.komm-one.dev

# acme@komm-one.dev
sudo -u root cat /etc/letsencrypt/live/cipher.komm-one.dev/fullchain.pem
sudo -u root cat /etc/letsencrypt/live/cipher.komm-one.dev/privkey.pem

# LOCAL ausführen
nano ~/Documents/work/certs/fullchain.pem
nano ~/Documents/work/certs/privkey.pem
openssl pkcs12 -export -out ~/Documents/work/certs/ciphermail.p12 -inkey ~/Documents/work/certs/privkey.pem -in ~/Documents/work/certs/fullchain.pem