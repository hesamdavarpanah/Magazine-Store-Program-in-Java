# Magazine Store Program in Java

This is a Magazine Store program written in Java that uses Spring framework and PostgreSQL for database management. The program also includes JWT authentication and Sentry logger for error tracking. The program is deployed on Docker for easy and efficient deployment.

## Installation

To use this program, you need to have the following software installed on your system:

- PostgeSQL 15
- Java Development Kit (JDK) 8 or later

To install PostgeSQL 15, follow the instructions provided on the [official PostgeSQL website]([[https://www.docker.com/get-started](https://www.postgresql.org/download/](https://www.postgresql.org/docs/current/tutorial-install.html))).

To install Java Development Kit, follow the instructions provided on the [official Java Development Kit]([[https://docs.docker.com/compose/install/](https://www.oracle.com/in/java/technologies/downloads/](https://docs.oracle.com/en/java/javase/21/install/overview-jdk-installation.html))).

## Setup Instructions
1. Clone this repository to your local machine using git clone https://github.com/hesamdavarpanah/CRUD-RDF-data.git
2. Make sure you have Java installed on your system.
3. Download and install Apache Jena from https://jena.apache.org/download/index.cgi.
4. Open the project in your preferred IDE (Eclipse, IntelliJ, etc).
5. Run the Main.java file to start the application.

This will start the Docker container and deploy the program. You can then access the program by opening a web browser and navigating to http://localhost:8080.

## Authentication

The Magazine Store program uses JWT authentication to secure access to the API endpoints. Users must authenticate themselves by providing a valid JWT token in the Authorization header of their HTTP requests.

## Error Tracking

The program uses Sentry logger to track errors and exceptions. This allows for easy debugging and troubleshooting of the program.

## Conclusion

This Magazine Store program in Java provides a simple and efficient way to manage magazine inventory and sales. With its use of Spring framework, PostgreSQL, JWT authentication, and Sentry logger, it is a robust and reliable tool for magazine store owners and managers. The use of Docker for deployment makes the program easy to deploy and manage.
