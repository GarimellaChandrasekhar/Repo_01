# Project README

Brief description
- Java Spring Boot application exposing product REST endpoints.

Prerequisites
- Java 17+
- Maven
- Run: `mvn spring-boot:run` (from project root)

Relevant files
- Controller: `src/main/java/com/hsbc/controller/ProductController.java`
- Entity: `src/main/java/com/hsbc/entity/Product.java` (definition inferred)
- Service: `src/main/java/com/hsbc/service/ProductService.java`

Base URL
- `http://localhost:8080`

REST Endpoints
- GET `\`/products\``
  - Description: Retrieve all products.
  - Controller method: `findAllProducts()`
  - Service used: `ProductService.findAllProducts()`
  - Request: none
  - Response: `200 OK`, `application/json`
  - Response body: JSON array of `Product` objects

- POST `\`/products\``
  - Description: Create/save a product.
  - Controller method: `insertProduct(@RequestBody Product product)`
  - Service used: `ProductService.saveProduct(Product)`
  - Request: `application/json` body representing a `Product`
  - Response: `200 OK` (note: controller currently returns the saved object directly; to return `201 Created` change to `ResponseEntity` and set status)
  - Response body: JSON of the saved `Product`

Service surface (observed / expected)
- `List<Product> findAllProducts()`
- `void saveProduct(Product product)` (or `Product saveProduct(Product product)` depending on implementation)

Product entity structure (inferred)
- Package: `com.hsbc.entity`
- Typical fields (adjust according to actual `Product` class):
  - `Long id`
  - `String name`
  - `String description`
  - `BigDecimal price`
  - `LocalDateTime createdAt` (optional)
- Example Java-like structure:
  ```java
  public class Product {
      private Long id;
      private String name;
      private String description;
      private BigDecimal price;
      // getters/setters, equals/hashCode, constructors
  }