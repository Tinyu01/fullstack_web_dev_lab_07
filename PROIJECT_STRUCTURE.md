# QuickCart Project Structure

This document outlines the folder structure for the QuickCart application.

```
ecommerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── quickcart/
│   │   │           └── ecommerce/
│   │   │               ├── controller/
│   │   │               │   ├── HomeController.java
│   │   │               │   └── ProductController.java
│   │   │               ├── model/
│   │   │               │   └── Product.java
│   │   │               ├── service/
│   │   │               │   └── ProductService.java
│   │   │               └── QuickCartApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── style.css
│   │       │   └── images/
│   │       │       ├── headphones.jpg
│   │       │       ├── placeholder.jpg
│   │       │       ├── smartphone.jpg
│   │       │       └── tshirt.jpg
│   │       ├── templates/
│   │       │   ├── layout.html
│   │       │   └── products/
│   │       │       ├── detail.html
│   │       │       └── list.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── quickcart/
│                   └── ecommerce/
│                       └── QuickCartApplicationTests.java
└── pom.xml
```

## File Placement Instructions

1. **Java Classes**:
   - Place all controller classes (`HomeController.java`, `ProductController.java`) in `src/main/java/com/quickcart/ecommerce/controller/`
   - Place model classes (`Product.java`) in `src/main/java/com/quickcart/ecommerce/model/`
   - Place service classes (`ProductService.java`) in `src/main/java/com/quickcart/ecommerce/service/`

2. **Templates**:
   - Place the layout template (`layout.html`) directly in `src/main/resources/templates/`
   - Create a `products` subfolder inside the templates folder for product-related templates
   - Place `list.html` and `detail.html` in `src/main/resources/templates/products/`

3. **Static Resources**:
   - Place the CSS file (`style.css`) in `src/main/resources/static/css/`
   - Create an `images` folder in `src/main/resources/static/` for storing product images

4. **Configuration**:
   - The main application class (`QuickCartApplication.java`) should remain in `src/main/java/com/quickcart/ecommerce/`
   - Edit `application.properties` in `src/main/resources/` if you need to configure application settings

## Folder Creation Steps

1. Create the following folders if they don't exist:
   ```
   src/main/java/com/quickcart/ecommerce/controller
   src/main/java/com/quickcart/ecommerce/model
   src/main/java/com/quickcart/ecommerce/service
   src/main/resources/static/css
   src/main/resources/static/images
   src/main/resources/templates/products
   ```

2. Place all files in their respective folders as outlined in the structure above.