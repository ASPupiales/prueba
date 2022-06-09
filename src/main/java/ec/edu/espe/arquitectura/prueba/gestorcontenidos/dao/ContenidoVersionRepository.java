package ec.edu.espe.arquitectura.prueba.gestorcontenidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.ContenidoVersion;

public interface ContenidoVersionRepository extends JpaRepository<ContenidoVersion, Integer> {
    
    

}
