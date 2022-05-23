package co.com.poli.productservice.controller;

import co.com.poli.productservice.persistence.entity.Category;
import co.com.poli.productservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public Category save(@RequestBody Category category){
        categoryService.save(category);
        return category;
    }

}
