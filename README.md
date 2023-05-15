# Magazine Store Program in Java

This is a Magazine Store program written in Java that uses Spring framework and PostgreSQL for database management. The program also includes JWT authentication and Sentry logger for error tracking. The program is deployed on Docker for easy and efficient deployment.

## Installation

To use this program, you need to have the following software installed on your system:

- Docker
- Docker Compose

To install Docker, follow the instructions provided on the [official Docker website](https://www.docker.com/get-started).

To install Docker Compose, follow the instructions provided on the [official Docker Compose website](https://docs.docker.com/compose/install/).

## Usage

To run the Magazine Store program, navigate to the project directory in the terminal and run the following command:

```shell
docker-compose up
```

This will start the Docker container and deploy the program. You can then access the program by opening a web browser and navigating to http://localhost:8080.

## Authentication

The Magazine Store program uses JWT authentication to secure access to the API endpoints. Users must authenticate themselves by providing a valid JWT token in the Authorization header of their HTTP requests.

## Error Tracking

The program uses Sentry logger to track errors and exceptions. This allows for easy debugging and troubleshooting of the program.

## Conclusion

This Magazine Store program in Java provides a simple and efficient way to manage magazine inventory and sales. With its use of Spring framework, PostgreSQL, JWT authentication, and Sentry logger, it is a robust and reliable tool for magazine store owners and managers. The use of Docker for deployment makes the program easy to deploy and manage.