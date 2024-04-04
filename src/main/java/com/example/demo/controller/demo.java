package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.dto.ProductDto2;
import com.example.demo.entity.Ay;
import com.example.demo.entity.ProductEntity;
//import com.example.demo.entity.Product_tag;
import com.example.demo.entity.TagEntity;
import com.example.demo.repository.AyRopository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class demo {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AyRopository ayRopository;

    @GetMapping("/")
    public List<Ay> adn(){
//        System.out.printf("ayyy" + productRepository.findAll().get(0).getAyId());
        return ayRopository.findAll();
    }

    @GetMapping("get-product")
    public List<ProductEntity> getProduct(){
//        Optional<ProductEntity> ay = productRepository.findById(7);
//        System.out.printf( "ay"+ay);
//        ProductDto productDto = new ProductDto();
//        productDto.setId(productRepository.findAllByTags_Id(2).get(0).getId());
//        List<TagEntity> tags = new ArrayList<TagEntity>();
//
//        for(Product_tag product_tag : productRepository.findAllByTags_Id(2).get(0).getTags()){
//            tags.add(product_tag.getTagg());
//        }
//        ProductDto2 productDto2 = new ProductDto2();
//        productDto2.setId(productRepository.findAllByTags_Id(2).get(0).getId());
//        productDto2.setName(productRepository.findAllByTags_Id(2).get(0).getName());
//        productDto2.setTags(tags);
        return productRepository.findAll();
    }

    @PostMapping("get-dto-product")
    public ProductEntity awdo(@RequestBody ProductDto productDto){

//        ProductEntity productEntity = new ProductEntity();
//        productEntity.setId(productDto.getId());
//        productEntity.setName(productDto.getName());
//        productEntity.setTags(productDto.getTags());
//        return productRepository.save(productEntity);
        return  new ProductEntity();
    }
}
