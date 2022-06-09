package ec.edu.espe.arquitectura.prueba.seguridad.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="seg_usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 11L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario",nullable = false)
    private Integer codUsuario;

    @Column(name = "username", nullable = false, length = 32)
    private String username;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "clave", nullable = false, length = 64)
    private String clave;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioEspacio> usuarioEspacios;


    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Usuario() {
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<UsuarioEspacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<UsuarioEspacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
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
        Usuario other = (Usuario) obj;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [codUsuario=" + codUsuario + "]";
    }

}
