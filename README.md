# AgroSupport

AgroSupport is a mobile application created by the startup AgroTech, designed to support farmers in Peru. The project aims to address major challenges in the agricultural sector, such as low productivity, lack of access to technology, and limited specialized knowledge.

The application connects inexperienced farmers with expert advisors, providing them with specialized guidance, tools for farm management, and resources to improve productivity and sustainability. AgroSupport offers features like inventory management, health records, planning tools, and access to market opportunities, all through an easy-to-use mobile interface. The project emphasizes the use of modern technology for sustainable agriculture and seeks to empower farmers to adopt better practices and improve their livelihoods.

---

## Main Features

- **RESTful APIs** for user, profile, advisor, post, and appointment management.
- **Security** with authentication and authorization (Spring Security, JWT).
- **DDD Architecture** (Domain Driven Design).
- **Modern mobile app** using Jetpack Compose, Room, Retrofit, and Firebase.

---

## Technologies Used

### Backend (Web Services)
- **Language:** Java 22
- **Framework:** Spring Boot 3, Spring Data JPA, Spring Web, Spring Boot DevTools, Spring Security, Spring Validation
- **Persistence:** MySQL
- **ORM:** JPA, Hibernate
- **Documentation:** Swagger (OpenAPI)
- **Others:** Lombok, JWT, Apache Commons, Pluralize, Springdoc-openapi

### Frontend (Mobile Application)
- **Language:** Kotlin
- **Framework:** Jetpack Compose
- **Local persistence:** Room
- **Navigation & UI:** Androidx, Material3, Compose
- **Networking:** Retrofit2, Gson Converter
- **Images:** Glide, Picasso
- **Cloud services:** Firebase (Storage)
- **Testing/QA:** JUnit, Espresso, Compose Test

---

## Installation & Commands

### Backend

1. Go to the Backend/Backend/agrosupport directory.
2. Install dependencies and run with Maven:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
3. Alternatively, you can build and run the application using Docker:
    ```bash
    docker build -t agrosupport-backend .
    docker run -p 8080:8080 agrosupport-backend
    ```
4. Swagger documentation will be available locally at:  
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

### Frontend

1. Go to the Frontend/Frontend/AgroSupport directory.
2. Open the project in Android Studio.
3. Sync dependencies (Gradle) and run the app on an Android emulator/device.

---

**Contact:**  
For questions, suggestions, or support, you can open an issue in this repository or contact the main author: [FerKlox](https://github.com/FerKlox)

