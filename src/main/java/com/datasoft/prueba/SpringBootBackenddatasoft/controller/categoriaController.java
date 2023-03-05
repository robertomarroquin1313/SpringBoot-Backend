package com.datasoft.prueba.SpringBootBackenddatasoft.controller;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Categoria;
import com.datasoft.prueba.SpringBootBackenddatasoft.repository.categoriaRepository;
import com.datasoft.prueba.SpringBootBackenddatasoft.service.categoriaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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


}
