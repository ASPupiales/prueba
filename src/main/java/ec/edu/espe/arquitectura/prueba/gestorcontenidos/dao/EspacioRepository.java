package ec.edu.espe.arquitectura.prueba.gestorcontenidos.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.Espacio;

public interface EspacioRepository extends JpaRepository<Espacio, Integer> {

    List<Espacio> findByNombreLikeOrderByNombreAsc(String nombrePattern);

    List<Espacio> findByFechaCreacionGreaterThan(Date fechaCreacion);

}
