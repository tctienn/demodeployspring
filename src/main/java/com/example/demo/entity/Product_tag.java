//package com.example.demo.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@Table(name="product_tag")
//public class Product_tag {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name="id")
//    Integer id;
//
////    @Column(name = "id_Product")
////    Integer idProduct;
//
////    @Column(name = "id_tag")
////    Integer idTag;
//
//    @ManyToOne
//    @JoinColumn(name = "id_Product")
//    ProductEntity product;
//
//    @ManyToOne
//    @JoinColumn(name = "id_tag")
//    TagEntity tagg;
//
//    @Override
//    public String toString() {
//        return "Product_tag{" +
//                "id=" + id +
//                ", product=" + product +
//                ", tagg=" + tagg +
//                '}';
//    }
//}
