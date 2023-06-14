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

# Pinot

## Schema

Import schema
```
docker exec -it pinot-controller bin/pinot-admin.sh AddSchema -schemaFile resources/schema.json -exec
```

```json
{
  "schemaName": "SimpleDataTable1",
  "dimensionFieldSpecs": [
    {
      "name": "name",
      "dataType": "STRING"
    },
    {
      "name": "surname",
      "dataType": "STRING"
    }
  ],
  "metricFieldSpecs": [
    {
      "name": "val0",
      "dataType": "LONG"
    },
    {
      "name": "val1",
      "dataType": "LONG"
    },
    {
      "name": "val2",
      "dataType": "LONG"
    },
    {
      "name": "val3",
      "dataType": "LONG"
    },
    {
      "name": "val4",
      "dataType": "LONG"
    },
    {
      "name": "val5",
      "dataType": "LONG"
    },
    {
      "name": "val6",
      "dataType": "LONG"
    },
    {
      "name": "val7",
      "dataType": "LONG"
    },
    {
      "name": "val8",
      "dataType": "LONG"
    },
    {
      "name": "val9",
      "dataType": "LONG"
    },
    {
      "name": "aggrVal0",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal1",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal2",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal3",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal4",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal5",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal6",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal7",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal8",
      "dataType": "DOUBLE"
    },
    {
      "name": "aggrVal9",
      "dataType": "DOUBLE"
    }
  ],
  "dateTimeFieldSpecs": [
    {
      "name": "timestamp",
      "dataType": "LONG",
      "format": "1:MILLISECONDS:EPOCH",
      "granularity": "1:MILLISECONDS"
    }
  ]
}
```