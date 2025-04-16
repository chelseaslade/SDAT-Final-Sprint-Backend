# SIMple Life - Backend (SDAT Final Sprint)
A backend meant to pair with SIMple life. (https://github.com/chelseaslade/simple-life)

## PROGRAM DETAILS
### FEATURES & TECHNOLOGY
* Technology:
    - Java (Maven)
    - MySQL Database
    - Spring Boot
    - Spring Data JPA
    - Docker
  

## HOW TO RUN
### REQUIRED TECHNOLOGY
* Docker Desktop (Open prior following below instructions)
* Postman (if testing endpoints)
* Java w/ Maven installed
* MySQL (edit password and user in applications.properties to match your credentials)

Run the following commands in IDE terminal to install and run: 

### GITHUB: CLONE REPOSITORY
```
git clone https://github.com/chelseaslade/SDAT-Final-Sprint-Backend
```
### MAVEN BUILD
```
mvn clean package
```
### BUILD & RUN IN DOCKER
* Ensure ports for program are not already in use (3306, 8080)
```
docker-compose up --build
```
### CHECK RUNNING CONTAINERS
```
docker ps
```

### STOP CONTAINERS
```
docker-compose down
```
