package com.ecomwebsite.Ecom.service;

import com.ecomwebsite.Ecom.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    void createCategory(Category category);


    String deleteCategory(Long categoryId);
}
