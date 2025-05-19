package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import com.quickcart.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

/**
 * Controller for handling product-related requests.
 * Maps URLs to methods that process requests and return views.
 */
@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    /**
     * Constructor injection of ProductService
     */
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Show list of all products
     * URL: /products
     */
    @GetMapping
    public String listProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products/list";
    }

    /**
     * Show details of a specific product
     * URL: /products/{id}
     */
    @GetMapping("/{id}")
    public String showProductDetails(@PathVariable Long id, Model model) {
        Optional<Product> product = productService.getProductById(id);
        
        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "products/detail";
        } else {
            // Product not found, redirect to products list
            return "redirect:/products";
        }
    }

    /**
     * Filter products by category
     * URL: /products/category?name=Electronics
     */
    @GetMapping("/category")
    public String listProductsByCategory(@RequestParam String name, Model model) {
        List<Product> products = productService.getProductsByCategory(name);
        model.addAttribute("products", products);
        model.addAttribute("category", name);
        return "products/list";
    }
}