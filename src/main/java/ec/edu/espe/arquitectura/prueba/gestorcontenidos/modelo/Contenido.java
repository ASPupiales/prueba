package ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable {
    
    private static final long serialVersionUID = 14L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer codContenidoPadre;

    @Column(name = "tipo_contenido", nullable = false)
    private Integer tipoContenido;

    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;

    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;

    @Column(name = "version", precision = 4, scale = 2)
    private BigDecimal version;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @OneToMany(mappedBy = "versionContenido")
    private List<ContenidoVersion> versiones;

    public Contenido(Integer codContenido, Integer codEspacio, Integer codContenidoPadre) {
        this.codContenido = codContenido;
        this.codEspacio = codEspacio;
        this.codContenidoPadre = codContenidoPadre;
    }

    public Contenido() {
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodContenidoPadre() {
        return codContenidoPadre;
    }

    public void setCodContenidoPadre(Integer codContenidoPadre) {
        this.codContenidoPadre = codContenidoPadre;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codContenido == null) ? 0 : codContenido.hashCode());
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
        Contenido other = (Contenido) obj;
        if (codContenido == null) {
            if (other.codContenido != null)
                return false;
        } else if (!codContenido.equals(other.codContenido))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contenido [codContenido=" + codContenido + "]";
    }
}
