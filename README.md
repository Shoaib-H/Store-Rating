Store Rating Application
Project Overview

The Store Rating Application is a Full Stack Web Application developed using:

Backend: Spring Boot
Database: MySQL
Frontend: Angular (Planned)

The application allows users to register, log in, and submit ratings for stores.
It also supports role-based access control for:

System Administrator
Normal User
Store Owner
Features Implemented
Authentication & Security
User Registration API
User Login API
Password Encryption using BCrypt
JWT Token Generation
Spring Security Integration
Protected APIs
Role-Based Authorization
User Roles
1. ADMIN
Manage users
Manage stores
Access admin dashboard
2. USER
Register and login
View stores
Submit ratings
3. STORE_OWNER
Login
View ratings for their store
View average store rating
Tech Stack
Backend
Java 17
Spring Boot
Spring Security
Spring Data JPA
JWT Authentication
Maven
Database
MySQL
Frontend
Angular (To be integrated)
Project Structure
src/main/java/com/shoaib/storerating

├── controller
├── dto
├── entity
├── repository
├── security
├── service
├── serviceimpl
└── StoreRatingApplication.java
API Endpoints
Authentication APIs
Register User
POST /api/auth/register
Login User
POST /api/auth/login
Sample Request Bodies
Register
{
  "name": "Shoaib Hashmi",
  "email": "shoaib@gmail.com",
  "password": "Password@123",
  "address": "Pune Maharashtra"
}
Login
{
  "email": "shoaib@gmail.com",
  "password": "Password@123"
}
JWT Authentication

After successful login, the API returns a JWT token.

Use the token in request headers:

Authorization: Bearer YOUR_TOKEN
Database Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/store_rating_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
How to Run the Project
1. Clone Repository
git clone <your-github-repository-url>
2. Open Project

Open the project in:

IntelliJ IDEA
OR
Eclipse IDE
3. Configure MySQL Database

Create database:

CREATE DATABASE store_rating_app;
4. Run Application

Run:

StoreRatingApplication.java

Application runs on:

http://localhost:8080
Future Enhancements
Angular Frontend Integration
Store Management Module
Rating Dashboard
Search & Filter Functionality
Pagination & Sorting
Docker Deployment
Swagger API Documentation
Author
Shoaib Hashmi
BE Computer Engineering
Savitribai Phule Pune University
Notes

This project was developed as part of a Full Stack Intern Coding Challenge using Java Spring Boot and MySQL with secure authentication and role-based authorization.
