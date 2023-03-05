package com.datasoft.prueba.SpringBootBackenddatasoft.Persistence;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "categorias" , schema ="prueba_tecnica_java_spring_springboot")
public class Categoria {

    /*cat_id int primary key,
cat_nombre varchar(50),
cat_orden int,
cat_imagen LONGBLOB*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long idCategoria;

    @Column (name = "cat_nombre")
    @Getter @Setter
    private String catNombre;

    @Column(name = "cat_orden")
    @Getter @Setter
    private int catOrden;

    @Column (name = "cat_imagen")
    @Getter @Setter
    private  byte cat_imagen;
}
