package com.quickcart.ecommerce.service;

import com.quickcart.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Service class for handling product-related business logic.
 * In a real application, this would interact with a database.
 * For demonstration purposes, we're using an in-memory storage solution.
 */
@Service
public class ProductService {
    
    // In-memory storage for products (simulating a database)
    private final Map<Long, Product> productMap = new HashMap<>();
    
    /**
     * Constructor that initializes some sample products
     */
    public ProductService() {
        // Add some sample products
        addSampleProducts();
    }
    
    /**
     * Get all products
     * @return List of all products
     */
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }
    
    /**
     * Get a product by its ID
     * @param id Product ID
     * @return Optional containing the product if found, empty otherwise
     */
    public Optional<Product> getProductById(Long id) {
        return Optional.ofNullable(productMap.get(id));
    }
    
    /**
     * Add a new product
     * @param product Product to add
     * @return Added product
     */
    public Product addProduct(Product product) {
        // Generate a new ID if not provided
        if (product.getId() == null) {
            long newId = productMap.isEmpty() ? 1 : productMap.keySet().stream().mapToLong(Long::longValue).max().getAsLong() + 1;
            product.setId(newId);
        }
        
        productMap.put(product.getId(), product);
        return product;
    }
    
    /**
     * Update an existing product
     * @param id Product ID
     * @param product Updated product data
     * @return Updated product, or null if product not found
     */
    public Product updateProduct(Long id, Product product) {
        if (productMap.containsKey(id)) {
            product.setId(id);
            productMap.put(id, product);
            return product;
        }
        return null;
    }
    
    /**
     * Delete a product
     * @param id Product ID
     * @return true if deleted, false if not found
     */
    public boolean deleteProduct(Long id) {
        if (productMap.containsKey(id)) {
            productMap.remove(id);
            return true;
        }
        return false;
    }
    
    /**
     * Get products by category
     * @param category Category name
     * @return List of products in the specified category
     */
    public List<Product> getProductsByCategory(String category) {
        return productMap.values().stream()
                .filter(product -> category.equalsIgnoreCase(product.getCategory()))
                .toList();
    }
    
    /**
     * Initialize with sample products
     */
    private void addSampleProducts() {
        // Sample product 1
        Product product1 = new Product(
                1L,
                "Smartphone X",
                new BigDecimal("599.99"),
                "Latest smartphone with advanced features and high-resolution camera.",
                "/images/smartphone.jpg",
                50,
                "Electronics"
        );
        
        // Sample product 2
        Product product2 = new Product(
                2L,
                "Wireless Headphones",
                new BigDecimal("129.99"),
                "Noise-cancelling wireless headphones with long battery life.",
                "/images/headphones.jpg",
                75,
                "Electronics"
        );
        
        // Sample product 3
        Product product3 = new Product(
                3L,
                "Cotton T-Shirt",
                new BigDecimal("24.99"),
                "Comfortable 100% cotton t-shirt available in various colors.",
                "/images/tshirt.jpg",
                100,
                "Clothing"
        );
        
        // Add to map
        productMap.put(product1.getId(), product1);
        productMap.put(product2.getId(), product2);
        productMap.put(product3.getId(), product3);
    }
}