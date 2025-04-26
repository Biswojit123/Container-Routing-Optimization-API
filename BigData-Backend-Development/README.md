# Container Routing Optimization API

This project implements an **Optimization API** for container routing at ports.  
It demonstrates backend development skills such as **Spring Boot API creation**, **optimization handling**, and **request/response processing**.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Maven
- Postman (for API testing)

---

## Features

- Accepts optimization requests containing container and port constraint details.
- Calculates optimal move plans based on simple business rules.
- Returns optimized move plans with assigned berth and start times.
- Clean, modular architecture following Spring Boot best practices.

---

## API Specification

### Endpoint:
POST /optimize-move/request

### Request Body (Example):

{
  "containers": [
    { "id": "C1", "arrivalTime": "2025-04-26T08:00:00" },
    { "id": "C2", "arrivalTime": "2025-04-26T09:30:00" }
  ],
  "constraints": {
    "berthsAvailable": 2,
    "priorityRules": ["earliestArrivalFirst"]
  }
}

### Response Body (Example):

{
  "totalMoves": 2,
  "completionTime": "2025-04-26T12:00:00",
  "movePlans": [
    { "containerId": "C1", "assignedBerth": 1, "moveStartTime": "2025-04-26T08:30:00" },
    { "containerId": "C2", "assignedBerth": 2, "moveStartTime": "2025-04-26T09:45:00" }
  ]
}

### How to Run Locally
1. Clone the Repository:
    
    git clone https://github.com/yourusername/container-optimization-api.git
 
2. Navigate to the project directory:
    
    cd container-optimization-api

3. Build and run the Spring Boot application:
    
     mvn spring-boot:run

4. Test Using Postman
     
     URL: http://localhost:8080/optimize-move/request

     Method: POST

     Body: Send JSON request as shown above.

### Performance Benchmark
   
   Local API response time: 20ms for 10 containers.

   Scales linearly with request size in current mock setup.

### About Me
   
   Developed by **Biswojit Jena**
   
   Passionate about backend engineering, clean code, and scalable system design.

    
        
