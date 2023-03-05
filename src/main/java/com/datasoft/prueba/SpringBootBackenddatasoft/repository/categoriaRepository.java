package com.datasoft.prueba.SpringBootBackenddatasoft.repository;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface categoriaRepository extends JpaRepository<Categoria, Long> {

}
