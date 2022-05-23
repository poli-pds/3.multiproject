package co.com.poli.productservice.controller;

import co.com.poli.productservice.persistence.entity.Category;
import co.com.poli.productservice.persistence.entity.Product;
import co.com.poli.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product){
        productService.save(product);
        return product;
    }
    @DeleteMapping("/{id}")
    public Product delete(@PathVariable("id") Long id){
        Product product = productService.findById(id);
        productService.delete(product);
        return product;
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping
    public List<Product> findByCategory(@RequestBody Category category){
        return productService.findByCategory(category);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

}
