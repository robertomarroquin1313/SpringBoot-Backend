package com.datasoft.prueba.SpringBootBackenddatasoft.Persistence;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Entity @Table(name = "productos")
public class Producto {

    /*
    * prd_id int primary key auto_increment,
 prd_nombre varchar(50),
 prd_descripcion varchar(200),
 prd_precio float(6,2),
 cat_id int ,
 prd_imagen longblob,
 * */

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;

    @Column (name = "prd_nombre")
    @Getter @Setter
    private String nameProd;

    @Column(name = "prd_descripcion")
    @Getter @Setter
    private String descProd;

    @Column(name = "prd_precio")
    @Getter @Setter
    private Float preProd;

    @Column(name = "cat_id")
    @Getter @Setter
    private int idCategoria;

    @Column(name = "prd_imagen")
    @Getter @Setter
    private byte prodImagen;

}