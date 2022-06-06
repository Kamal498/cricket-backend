# CRICKET-BACKEND

![68747470733a2f2f756361726563646e2e636f6d2f35303831633736342d663561632d346362372d626430382d3666393032643835303037312f](https://user-images.githubusercontent.com/67726713/172095963-60ec136e-9c37-47bc-b823-6d8bde79ea69.png)

## REST Client: 
  -> It can be any user, browser, postman sending a request to the microservice with appropriate authorizaion headers.
  
## API Gateway:
  -> The Gateway is designed using Spring Cloud API Gateway. It is runnig on port 9000.   
  -> All incoming requests first passes through this gateway before being routed to appropriate microservice.  
  -> The client will hit the url of the api-gateway, the microservice urls are not hit directly.  
  -> The API Gateway is working with Spring Eureka Discovery Server to route requests to appropriate microservice.  
  -> Authentication is implemented in the gateway, all the requests need to have a valid authorization token   
     in the header of the request to access the microservices.   
  -> Spring Cloud API Gateway has client-side load balancing inbuilt.  
  
  ## Spring Eureka Discovery Server
  <img width="877" alt="eureka_server" src="https://user-images.githubusercontent.com/67726713/172100043-0288e6ec-690a-442d-bd8f-2824f7ec9c4a.png">

  
   -> This is the Discovery/Registry server made using Spring Cloud Netflix Eureka. It is running on port 8761.  
   -> All the microservices register itself with Eureka server.  
   -> In case of application with large number of microservices, Service registry helps to keep track of all the microservices  
   available and running.  
   -> Microservices can call each other using the name by which they are registered in the Eureka Server.  
   
   ## Microservice 1: Cricket-Auth-Service
   -> This is an Authentication service. It is running on port 9192.  
   -> Any new user will register itselft by hitting the url '/auth/register' with userName, email and password in the body.   
   The user data will be saved on the mysql database.  
   -> Then user can login himself/herself by hitting the url '/auth/login' with its userName and password. If valid request the  
   user will be returned with a JWT token which will be used to make request to other microservices.
   
   ## Microservice 2: Cricket-Matches-API
   -> 
   
