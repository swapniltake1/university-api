
# University Management System - A Spring Boot API | Spring DATA REST 

Welcome to the University Management System repository!
This project is built using Spring Boot and provides functionality for managing
students, departments, and courses in a university setting.


## Features

- CRUD operations for students, departments, and courses.
- RESTful API for interacting with the system.
- Easy-to-use Spring Boot application structure.
- Integration with H2 in-memory database & MySQL Database.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle build tool

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/swapniltake1/university-api.git
   cd university-api
   ```

2. Build the project:
   ```bash
   ./mvnw clean install
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

After following the installation steps, the Spring Boot application will be running locally. You can access the API endpoints through the base URL: `http://localhost:8080/api`.

## Endpoints

- **GET /api/students**: Get all students
- **POST /api/students**: Create a new student
- **GET /api/departments**: Get all departments
- **POST /api/departments**: Create a new department
- **GET /api/courses**: Get all courses
- **POST /api/courses**: Create a new course

For more details on the available endpoints and their request/response formats, refer to the [API documentation](API.md).

## Contributing

Contributions to this project are welcome! If you find a bug or want to add a new feature, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Commit your changes.
4. Push your changes to your forked repository.
5. Create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
```

Remember to replace placeholders such as `swapniltake1`, `university-api`, and URLs with your actual repository information. You can also customize the sections, content, and formatting to better suit your project's specific needs.
