# QuickCart E-commerce Application

A Spring MVC-based e-commerce application for managing and displaying products in an online store.

## Project Overview

QuickCart is a web application designed to showcase products for an online store. This project implements a basic product catalog using Spring MVC architecture.

## Tech Stack

- Java 21
- Spring Boot 3.3.5
- Maven
- Thymeleaf (for views)

## Project Structure

The application follows the Model-View-Controller (MVC) architectural pattern:

- **Models**: Represent product data (name, price, description, etc.)
- **Views**: Thymeleaf templates that display products to customers
- **Controllers**: Handle logic to connect data to views and manage user interactions

## Setup Instructions

### Prerequisites

- Java 21 JDK
- Maven
- IntelliJ IDEA or any preferred IDE

### Installation

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/quickcart.git
   ```

2. Open the project in your IDE

3. Run the application:
   ```
   mvn spring-boot:run
   ```
   
   Or run the `QuickCartApplication.java` file from your IDE

4. Access the application at http://localhost:8080

## Implementation Plan

### Phase 1: Basic Structure Setup ✅
- Project initialization with Spring Initializr
- Configure dependencies
- Test basic setup

### Phase 2: Product Catalog Implementation
- Create Product model
- Develop ProductController
- Design product listing view
- Implement product detail view

### Phase 3: Additional Features
- Add shopping cart functionality
- Implement user authentication
- Add order processing

## Project Components

### Models
- `Product.java`: Represents a product with properties like id, name, price, description, and imageUrl

### Controllers
- `ProductController.java`: Handles product-related requests and connects product data with views

### Views
- `products/list.html`: Displays all products in a catalog format
- `products/detail.html`: Shows detailed information about a specific product

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request