# Updates
sudo apt update
sudo apt full-upgrade -y
# Docker
curl -sSL https://get.docker.com/ | CHANNEL=stable sh
systemctl enable --now docker
# Docker Compose
LATEST=$(curl -Ls -w %{url_effective} -o /dev/null https://github.com/docker/compose/releases/latest) && LATEST=${LATEST##*/} && curl -L https://github.com/docker/compose/releases/download/$LATEST/docker-compose-$(uname -s)-$(uname -m) > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose
# MailCow
sudo -i
cd /opt
git clone https://github.com/mailcow/mailcow-dockerized
cd mailcow-dockerized

./generate_config.sh
    --> mail.komm-one.dev

docker compose pull
docker compose up -d