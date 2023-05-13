
# Spring mega application

This repository shall be part of my upcoming medium blog series where I'll be demonstrating various spring cloud comnponents. On compleation of this application, it'll be having 2 microservices, Distributed Logging using Zipkin, Configuration Server, Eureka Service registry, API Gateway & Hysterix circuit breaker.

## Technical Diagram/flow
![Diagram](https://github.com/prerak13/SpringMegaApp/blob/master/diagram.png)

## Objective

Create a spring application and demonstrate various cloud components.

## Features

- Application consist of Eureka Service registry from where all microservice discovers other services/register themselves.

- Zipkin and Sluth is used to do distribution logging.

- We have a config server which reads configuration from git and other services fetches this configuration.

- We have used Hysterix for circuit breaking, so if a service is unavailable, fallback methord shall be called.


## Demo

- I'll host it somewhere for demo in future.


## About Me
I'm a full stack developer and cloud engineer currently persuing my postgraduation at Dalhousie University.
I am looking for co-op/full time job oppertunities in Canada.
Feel free to contact me on:

Feel Free To Reach Me At:
- [Medium](https://medium.com/@prerakchoksi)
- [Git](https://github.com/prerak13)
- [Linkedin](https://www.linkedin.com/in/prerak13/)
- pc@dal.ca

## Run Locally

- Clone the project
- Go to the project directory
- Install dependencies
- Run project
