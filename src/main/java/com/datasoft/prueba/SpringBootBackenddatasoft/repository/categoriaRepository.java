package com.datasoft.prueba.SpringBootBackenddatasoft.repository;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriaRepository extends JpaRepository<Categoria, Long> {
}
