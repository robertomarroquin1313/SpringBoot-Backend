package com.datasoft.prueba.SpringBootBackenddatasoft.controller;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Producto;
import com.datasoft.prueba.SpringBootBackenddatasoft.service.productoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class productoController {

    @Autowired
    productoImpl product;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Producto>> listOfProductos(){
        return new ResponseEntity<List<Producto>>(product.getProd(), HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Producto> getProdcuto (@PathVariable("id") Long id) throws Exception{
        return new ResponseEntity<Producto>(product.getProdById(id),HttpStatus.FOUND);
    }

}
