package ec.edu.espe.arquitectura.prueba.seguridad.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.prueba.seguridad.modelo.UsuarioEspacio;
import ec.edu.espe.arquitectura.prueba.seguridad.modelo.UsuarioEspacioPK;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {
    
    List<UsuarioEspacio> findByEstado(String estado);

}
