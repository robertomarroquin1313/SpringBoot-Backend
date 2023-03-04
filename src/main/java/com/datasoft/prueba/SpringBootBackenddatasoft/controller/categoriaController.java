package com.datasoft.prueba.SpringBootBackenddatasoft.controller;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Categoria;
import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Producto;
import com.datasoft.prueba.SpringBootBackenddatasoft.service.categoriaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorias")
public class categoriaController {

    @Autowired
    categoriaImpl cate;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> listOfCategoria(){
        return new ResponseEntity<List<Categoria>>(cate.getCategoria(), HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> getCategoria (@PathVariable("id") Long id) throws Exception{
        return new ResponseEntity<Categoria>(cate.getCategoriaById(id),HttpStatus.FOUND);
    }

    @RequestMapping(method = RequestMethod.POST)
    public  ResponseEntity<String> saveCategoria(@RequestBody Categoria cate2){
        return new ResponseEntity<String>(cate.saveCategoria(cate2),HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteCategoria(@PathVariable Long id) throws Exception{
        return new ResponseEntity<String>(cate.deleteCategoria(id),HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateCategoria(@PathVariable Long id, @RequestBody Categoria cate2){
        cate2.setIdCategoria(id);
        String message = cate.updateCategoria(cate2);
        if(message.equals("Can't delete it")){
            throw new RuntimeException("No se pudo actualizar registro");
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}