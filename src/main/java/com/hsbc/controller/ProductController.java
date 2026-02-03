package com.hsbc.controller;

import com.hsbc.entity.Product;
import com.hsbc.exception.InvalidIdException;
import com.hsbc.exception.ProductCreationException;
import com.hsbc.exception.ProductUpdateException;
import com.hsbc.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
@CrossOrigin (origins = "*")
public class ProductController {
    /*FindAll FindById Save Update Delete*/
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService= productService;
    }
    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts() {
        List<Product> products = productService.findAllProducts();
        return ResponseEntity.ok(products);
    }
    @PostMapping
    public ResponseEntity<Product> insertProduct(@RequestBody Product product) throws ProductCreationException {
        productService.saveProduct(product);
        return ResponseEntity.ok(product);
    }
    @GetMapping("/{X}")
    public ResponseEntity<Product> findProductById(@PathVariable("X") int id) throws Exception {
        Product product= productService.findProduct(id);
        return ResponseEntity.ok(product);
    }
    @PutMapping("/{X}")
    public Product editProduct(@PathVariable("X") int id, @RequestBody Product product) throws InvalidIdException {
        product.setId(id);
        Product updatedProduct= productService.updateProduct(product);
        return updatedProduct;}

    @DeleteMapping("/{X}")
    public Product deleteProduct(@PathVariable("X") int id) throws InvalidIdException {
        Product deletedProduct= productService.deleteProduct(id);
        return deletedProduct;}
}
