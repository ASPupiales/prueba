package ec.edu.espe.arquitectura.prueba.gestorcontenidos.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.dao.ContenidoVersionRepository;
import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.ContenidoVersion;

@Service
public class ContenidoVersionService {
    
    private ContenidoVersionRepository contenidoVersionRepository;

    public ContenidoVersionService(ContenidoVersionRepository contenidoVersionRepository) {
        this.contenidoVersionRepository = contenidoVersionRepository;
    }

    public void crear(ContenidoVersion contenidoVersion){
        contenidoVersion.setFechaCreacion(new Date());
        this.contenidoVersionRepository.save(contenidoVersion);
    }

}
