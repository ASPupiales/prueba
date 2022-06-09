package ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {
    
    private static final long serialVersionUID = 15L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;

    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;

    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;

    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;

    @Column(name = "tamanio", precision = 9, scale = 2)
    private BigDecimal tamanio;

    @Column(name = "version", nullable = false, precision = 9, scale = 0)
    @Version
    private BigDecimal version;

    @Column(name = "comentario", length = 500)
    private String comentario;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

    @ManyToOne(optional = false)
    private Version versionContenido;

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Version getVersionContenido() {
        return versionContenido;
    }

    public void setVersionContenido(Version versionContenido) {
        this.versionContenido = versionContenido;
    }

    public ContenidoVersion() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codContenidoVersion == null) ? 0 : codContenidoVersion.hashCode());
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
        ContenidoVersion other = (ContenidoVersion) obj;
        if (codContenidoVersion == null) {
            if (other.codContenidoVersion != null)
                return false;
        } else if (!codContenidoVersion.equals(other.codContenidoVersion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ContenidoVersion [codContenidoVersion=" + codContenidoVersion + "]";
    }

}
