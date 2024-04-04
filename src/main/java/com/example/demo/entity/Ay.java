package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ay")
@Data
public class Ay {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "ays")
    private List<ProductEntity> prducts;
}
