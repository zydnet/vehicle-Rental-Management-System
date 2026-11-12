# Fleet Platform

Full Stack Development project 

---

## 📁 Unit Overview

| Unit | Title | Technologies | Description |
| :--- | :--- | :--- | :--- |
| **[Unit 1](./unit-1)** | Frontend Basics | HTML5, CSS3 | Static fleet dashboard with Devanshia branding and vehicle operations. |
| **[Unit 2](./unit-2)** | Client-side Scripting | HTML5, CSS3, JavaScript | Search, fleet state updates, validation, and local persistence for the Devanshia dashboard. |
| **[Unit 3](./unit-3)** | Database Connectivity | HTML, CSS, JS, MySQL, Express | Connects a Devanshia-aware database (`devanshia_db`) through a Node.js/Express backend. |
| **[Unit 4](./unit-4)** | Backend Integration | Spring Boot 3, REST API, MySQL | Connects the Devanshia REST backend to the web interface on port 8081. |
| **[Unit 5](./unit-5)** | Full CRUD Final Project | Spring Boot 3, JPA, MySQL, Web UI, Swagger | Complete enterprise-ready fleet platform with Devanshia branding, CRUD workflows, analytics, and OpenAPI docs. |
| **[SQL Project](./vehicle-rental-sql)** | Database Architecture & Analytics | MySQL, Relational Design | SQL schema and analytics modules adapted for the Devanshia fleet ecosystem. |

---

## 🚀 Quick Start by Unit

* **Unit 1:** Open `unit-1/index.html` in your web browser.
* **Unit 2:** Open `unit-2/index.html` in your web browser.
* **Unit 3:** In `unit-3/`: run `npm install && npm start`, then open `http://localhost:3000`.
* **Unit 4:** In `unit-4/`: run `mvn spring-boot:run` (or with H2: `mvn spring-boot:run -Dspring-boot.run.profiles=h2`), then open `http://localhost:8081`.
* **Unit 5:** In `unit-5/`: run `mvn spring-boot:run` (or with H2: `mvn spring-boot:run -Dspring-boot.run.profiles=h2`), then open `http://localhost:8081`.
  * **Swagger UI:** `http://localhost:8081/swagger-ui.html`

---

## 🚗 Domain Model: Fleet & Rental Attributes

Each vehicle record in the Devanshia system contains:
* **Registration / License Plate:** Unique identifier (e.g., `KA-01-EA-2024`, `MH-02-CB-1988`)
* **Make & Model:** Vehicle manufacturer and model name (e.g., `Toyota Camry Hybrid`, `Tesla Model 3`)
* **Category:** Vehicle classification (`Sedan`, `SUV`, `Electric`, `Luxury`, `Sports`)
* **Daily Rate ($/day):** Pricing rate for rental
* **Fuel Type:** `Petrol`, `Diesel`, `Electric`, `Hybrid`
* **Status:** `AVAILABLE`, `RENTED`, `MAINTENANCE`
* **Seating Capacity:** 4, 5, 7 seats
* **Mileage:** Odometer reading in kilometers
* **Renter Details:** Current customer renting the vehicle (when status is RENTED)
