# [MICROSERVICE] - RETRY / RATE LIMITER (Spring Boot) 
https://github.com/hoaqhienn/Springboot-Retry-RateLimiter/assets/87158643/2da9a801-05ad-4432-b871-4f96a95b349a
## Features
### Retry Mechanism
Implements a robust retry mechanism to enhance resilience against transient failures. This mechanism allows the services to automatically retry failed requests, thereby improving the overall reliability of the system.
### Rate Limiter
Integrates a rate limiter component to control the rate of incoming requests to the services. This ensures that the services can handle varying levels of traffic without becoming overwhelmed, preventing performance degradation or service disruptions.
## Service Details
### FirstService
Apply `Retry Mechanism` and `Rate Limiter`.

Returns the string ***'Response from second service'***  when calling the `GET` method to the address https://localhost:8080/call **(Using RestTemplate to call SecondService)**.

Returns the string ***'Request processed successfully'*** when calling the `GET` method to the address https://localhost:8080/endpoint.
### SecondService
Returns the string ***'Response from second service'*** when calling the `GET` method to the address https://localhost:8081/call
## Technologies Used
Spring Boot: The project is built using the Spring Boot framework. https://start.spring.io/




