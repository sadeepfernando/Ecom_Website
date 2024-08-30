package com.ecomwebsite.Ecom.controller;

import com.ecomwebsite.Ecom.model.Category;
import com.ecomwebsite.Ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @PostMapping("/api/admin/category")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Category created successfully";
    }

    @DeleteMapping("/api/admin/category/{categoryId}")
    public String deleteCategory(@PathVariable Long categoryId){
        String status = categoryService.deleteCategory(categoryId);
        return status;
    }
}
