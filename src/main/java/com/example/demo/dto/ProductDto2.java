package com.example.demo.dto;

import com.example.demo.entity.TagEntity;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto2 {
        Integer id;
        String name;
        List<TagEntity> tags;
}
