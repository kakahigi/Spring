package com.study.apidemo.Springboot.study.controllers;

import com.study.apidemo.Springboot.study.models.Product;
import com.study.apidemo.Springboot.study.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products") // anh xa cac request
public class ProductController {
    //DI = Dependency Injection
    @Autowired
    private ProductRepository repository; // doi tuong ProductRepository duoc tao ra khi app duoc tao, tao 1 lan duy nhat

    @GetMapping("")
    //this request is: http://localhost:8080/api/v1/Products
    List<Product> getAllProducts(){
//      return List.of(
//               new Product(1L,"Macbook pro 16 inch", 2020, 2400.0,""),
//               new Product(2L,"ipad air green", 2021, 599.0,"")
//
//       );
        return repository.findAll(); // where is data ? ham nay co san roi nen chi can go findAll la ok framework la day chu dau
       //You must save this to Database, Now we have H2 DB = In-memory Database
       //You can also send request using Postman
    }
}
