package ec.edu.espe.arquitectura.prueba.seguridad.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.edu.espe.arquitectura.prueba.gestorcontenidos.modelo.Espacio;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {
    
    private static final long serialVersionUID = 12L;

    @EmbeddedId
    private UsuarioEspacioPK pk;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @ManyToOne(optional = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    private Espacio espacio;

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public UsuarioEspacio() {
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        UsuarioEspacio other = (UsuarioEspacio) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioEspacio [pk=" + pk + "]";
    }

}
