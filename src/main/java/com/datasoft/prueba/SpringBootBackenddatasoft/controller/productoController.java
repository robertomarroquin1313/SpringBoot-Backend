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

    @RequestMapping(method = RequestMethod.POST)
    public  ResponseEntity<String> saveProducto(@RequestBody Producto prod){
        return new ResponseEntity<String>(product.saveProd(prod),HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteProd(@PathVariable Long id) throws Exception{
        return new ResponseEntity<String>(product.deleteProd(id),HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateDepartment(@PathVariable Long id, @RequestBody Producto prod){
        prod.setIdProd(id);
        String message = product.updateProducto(prod);
        if(message.equals("Can't delete it")){
            throw new RuntimeException("No se pudo actualizar registro");
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }



}
