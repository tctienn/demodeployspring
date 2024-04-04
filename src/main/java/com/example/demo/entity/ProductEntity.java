package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;



    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="iday", insertable = false, updatable = false)
    private Ay ays;

//    private Integer ay;
//    @Transient
//    @JsonIgnore
//    private Integer idAy ;
//    public Integer getAys() {
//        this.idAy = (ays != null) ? ays.getId() : null;
//        return idAy;
//    }

    @ManyToMany
    @JoinTable(
            name = "product_tag",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_tag")
    )
    List<TagEntity> tags;


//    @OneToMany(mappedBy = "product")
//    List<Product_tag> tags;

//    @Override
//    public String toString() {
//        return "ProductEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", tags=" + tags +
//                '}';
//    }
}
