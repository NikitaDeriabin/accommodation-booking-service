# Accommodation Booking Service

The Booking Service is an application that provides functionality for managing property rent. As a customer you can easily join, search for appropriate option, create a reservation and pay by card. As a manager, you have a lot of tools to arrange accommodations, see all bookings, payments with its status of specific user, create new accommodations and update existing ones.

### ⚡️Moreover, application provides

* automatic checking for expired bookings once a day (and sending a message to managers)
* 30 minutes to pay for created booking (otherwise it'll be cancelled)
* telegram notifications for users about creating bookings, payments and new accommodations available

## Table of Contents
* [Technologies](#technologies)
* [Architecture](#architecture)
* [Features](#features)
* [Class diagram](#class-diagram)
* [Entities](#entities)
* [Endpoints](#endpoints)
* [Configure Telegram Bot and Stripe account](#bot-stripe-config)
* [Project Launch with Docker](#project-launch-with-docker)
* [Test with Swagger on AWS](#project-swagger)

<a name="technologies"></a>
## 💻Technologies

* **Programming language:** Java 17
* **Spring Framework:** Spring Boot v3.1.5, Spring Data, Spring Security v6.1.5 (Authentication using JWT token)
* **Database Management:** PostgreSQL 42.7.0, Hibernate, Liquibase v4.20.0
* **Notification management:** Telegram bot 5.2.0
* **Payment processing:** Stripe 22.3.0
* **Testing:** JUnit 5, Mockito, TestContainers v1.19.2, PostgreSQL 42.7.0
* **Deployment and Cloud Services:** Docker 3.8, AWS
* **Additional instruments:** Maven, Lombok, Mapstruct
* **Documentation:** Swagger
