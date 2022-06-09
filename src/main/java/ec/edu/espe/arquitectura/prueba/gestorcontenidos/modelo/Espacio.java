package ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {

    private static final long serialVersionUID = 13L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "nombre",  nullable = false, length = 128)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Espacio() {
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEspacio == null) ? 0 : codEspacio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Espacio other = (Espacio) obj;
        if (codEspacio == null) {
            if (other.codEspacio != null)
                return false;
        } else if (!codEspacio.equals(other.codEspacio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Espacio [codEspacio=" + codEspacio + "]";
    }

    

}
