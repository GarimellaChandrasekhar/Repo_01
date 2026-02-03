package com.hsbc.service;

import com.hsbc.entity.Product;
import com.hsbc.exception.InvalidIdException;
import com.hsbc.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
    public Product findProduct(int id) throws InvalidIdException {
        Optional<Product> optionalProduct = productRepo.findById(id);
        Product product = optionalProduct.orElseThrow(()-> new InvalidIdException("Invalid Id : " + id));
        return product;
    }

    public Product updateProduct(Product product) throws InvalidIdException {
        findProduct(product.getId());
        return productRepo.save(product);
    }
    public Product deleteProduct(int id) throws InvalidIdException{
        Product p=findProduct(id);
        productRepo.deleteById(id);
        return p;
    }

    public List findAllProducts(){
      List<Product> l= productRepo.findAll();
      return l;
    }

    public List<Product> findByName(String name){
        List<Product> products=productRepo.findByName(name);
        return products;
    }
        public List<Product> findByParitalName(String name){
        return productRepo.findByPartialName(name);
    }
    }


