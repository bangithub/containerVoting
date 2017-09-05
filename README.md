# Voting project
The application goal is to run `J2EE application` as a service with Springboot framework, Thymeleaf and AngularJs as a front end and JPA Redis and Posgresql as back end.

## Springboot+Thymeleaf and Docker
Voting application with Springboot + Thymeleaf as a service.

## Packages details 
    - Vote : SpringBoot + Thymeleaf + redis 
    - Worker : SpringBoot + redis + postgres
    - Result : SpringBoot + Thymeleaf + postgres

# Dev configuration
    - docker run --name redis -p 6379:6379 redis:latest
    - docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=password -d postgres:9.4

# in a container
... coming soon
 
	
