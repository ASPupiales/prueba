package ec.edu.espe.arquitectura.prueba.gestorcontenidos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.Contenido;

public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
    
    List<Contenido> findByEstado(Integer estado);

    List<Contenido> findByNombreLikeOrderByNombre(String nombrePattern);

}
