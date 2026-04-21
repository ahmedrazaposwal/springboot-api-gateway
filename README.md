# springboot-api-gateway
The API Gateway acts as a single entry point that routes incoming client requests to appropriate microservices using service discovery.

## Local Setup

1. Clone the repository

2. Create a local config file:

```bash
cp src/main/resources/application-dev.properties.example src/main/resources/application-dev.properties
```

3. Set your MongoDB connection string as an environment variable:

```bash
export MONGODB_URI="your_mongodb_connection_string"
```

4. Run the application with the dev profile:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

