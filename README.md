# Spring-3 — Students Management with Thymeleaf (2025)

Original historical Spring Boot MVC application in the nested **`students/`** folder. Java 21, Spring Boot 3.5.6, Thymeleaf, Gradle.

## Features in current source
- Home page at `/`
- List and search students at `/students`
- Add a student using form `/add-student`

The project uses the original database/repository layer; review `students/src/main/resources/application.properties` to determine local configuration. This is an original coursework repository and is **distinct from** the later `student-exam-results` rebuild.

## Run
- Install Java JDK 21.
- Open `students/` in IntelliJ IDEA, or from root:

  ```cmd
  cd students
  gradlew.bat bootRun
  ```

  Linux/macOS: `chmod +x gradlew && ./gradlew bootRun`.

- Open **http://localhost:8080/**.

## Verify
`cd students && gradlew.bat clean test bootJar` or use the green check in GitHub Actions.

No claim of complete edit/delete workflow or production security unless tested.
