# learn-scala
Repo for learning Scala

### Setup Scala

Install Java 8 via [Jabba](https://github.com/shyiko/jabba)
and sbt.

- Configurable Java version: supports OpenJDK, GraalVM, Zulu and any other Java
  version that's installable via Jabba.

#### OSX
The `sbt` command is installed using `brew install sbt`.

#### Ubuntu

##### Java 8
sudo apt-get update
sudo apt-get install openjdk-8-jre -y

##### Scala
sudo apt-get remove scala-library scala
sudo wget http://scala-lang.org/files/archive/scala-2.12.1.deb
sudo dpkg -i scala-2.12.1.deb
sudo apt-get update
sudo apt-get install scala -y

##### SBT
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt -y

## Usage:

### Compile
```
sbt compile
```

### Run
```
sbt run
```
