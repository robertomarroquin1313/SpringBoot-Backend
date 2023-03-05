package com.datasoft.prueba.SpringBootBackenddatasoft.service;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Categoria;
import com.datasoft.prueba.SpringBootBackenddatasoft.repository.categoriaRepository;
import com.datasoft.prueba.SpringBootBackenddatasoft.service.interfaces.categoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoriaImpl  implements categoriaService {

    @Autowired
    categoriaRepository repositoryCategoria;

    public List<Categoria> getCategoria(){
        return repositoryCategoria.findAll();
    }

    public Categoria getCategoriaById(Long id) throws Exception{
        Optional<Categoria> cate = repositoryCategoria.findById(id);
        if(!cate.isPresent()){
            throw new Exception();
        }
        return cate.get();
    }


}
