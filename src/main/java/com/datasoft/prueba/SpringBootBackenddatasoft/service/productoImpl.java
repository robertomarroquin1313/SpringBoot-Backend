package com.datasoft.prueba.SpringBootBackenddatasoft.service;


import com.datasoft.prueba.SpringBootBackenddatasoft.repository.productoRepository;
import com.datasoft.prueba.SpringBootBackenddatasoft.service.interfaces.productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Producto;
import java.util.List;
import java.util.Optional;

@Service
public class productoImpl implements productoService {

    @Autowired
    productoRepository repositoryProducto;


    public List<Producto> getProd(){
        return repositoryProducto.findAll();
    }

    public Producto getProdById(Long id) throws Exception{
        Optional<Producto> prod = repositoryProducto.findById(id);
        if(!prod.isPresent()){
            throw new Exception();
        }
        return prod.get();
    }

    public  String saveProd(Producto prod){
        if(repositoryProducto.save(prod)!=null){
            return "SAVED";
        }
        return "UNSAVED";
    }

    public String deleteProd(Long id) throws Exception{
        Optional<Producto> prod= repositoryProducto.findById(id);
        if(!prod.isPresent()){
            return "Can not delete it";
        }
        Producto pprod = prod.get();
        repositoryProducto.delete(pprod);
        return "Deleted";

    }

    public String updateProducto(Producto prod){
        if(repositoryProducto.save(prod)!=null){
            return "Saved";
        }
        return "Unsaved";
    }
}
