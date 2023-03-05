package com.datasoft.prueba.SpringBootBackenddatasoft.repository;

import com.datasoft.prueba.SpringBootBackenddatasoft.Persistence.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface productoRepository extends JpaRepository<Producto,Long> {
}
