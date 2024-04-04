package com.example.demo.dto;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.TagEntity;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {

//    Integer id;
//    String name;
//    List<TagEntity> tags;

    Integer id;
   List<ProductEntity> products;
    List<TagEntity> tags;

}
