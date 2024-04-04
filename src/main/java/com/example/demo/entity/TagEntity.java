package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tag")
@Data
public class TagEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name ="name")
    private String name;
//    @JsonIgnore
//    @ManyToMany(mappedBy = "tags")
//    List<ProductEntity> poducts;

//    @OneToMany(mappedBy = "tagg")
//    List<Product_tag> producs;

//    @Override
//    public String toString() {
//        return "TagEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", producs=" + producs +
//                '}';
//    }
}
