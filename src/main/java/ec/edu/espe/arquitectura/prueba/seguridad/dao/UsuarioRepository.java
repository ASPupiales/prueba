package ec.edu.espe.arquitectura.prueba.seguridad.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.prueba.seguridad.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    List<Usuario> findByEstado(String estado);

    List<Usuario> findByNombreLikeOrderByNombreAsc(String nombrePattern);

    List<Usuario> findByUsernameLikeOrderByUsernameAsc(String usernamePattern);

}
