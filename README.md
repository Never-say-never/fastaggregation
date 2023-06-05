# Ubuntu ready to work

## Install git

```
sudo apt install git -f \
&& ssh-keygen -t rsa -b 4096 -C "fokin051990@gmail.com" \
&& cat ~/.ssh/id_rsa.pub
```
## Install JDK (Option available on Idea)
 - download any version of JDK for Intellij IDEA

## Install maven
```
sudo apt install maven
```

## Install docker
```
sudo apt install apt-transport-https ca-certificates curl software-properties-common
```
```
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
```

```
echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```
```
apt-cache policy docker-ce
sudo apt install docker-ce
```
### Add user to user group
```
sudo usermod -aG docker ${USER}
su - ${USER}
groups
sudo usermod -aG docker ${USER}
```
### Start as service
```
sudo systemctl start docker
```
## Install Idea
```
sudo snap install intellij-idea-community --classic
```