package ec.edu.espe.arquitectura.prueba.gestorcontenidos.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.EstadoContenidoEnum;
import ec.edu.espe.arquitectura.prueba.gestorcontenidos.dao.ContenidoRepository;
import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.Contenido;

@Service
public class ContenidoService {
    
    private ContenidoRepository contenidoRepository;

    public ContenidoService(ContenidoRepository contenidoRepository) {
        this.contenidoRepository = contenidoRepository;
    }

    public void crear(Contenido contenido){
        contenido.setEstado(EstadoContenidoEnum.ACTIVO.getValor());
        this.contenidoRepository.save(contenido);
    }

}
