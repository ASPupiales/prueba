package ec.edu.espe.arquitectura.prueba.gestorcontenidos;

public enum EstadoContenidoEnum {
    ACTIVO(1, "Activo"),
    INACTIVO(0, "Inactivo");

    private final Integer valor;
    
    private final String texto;

    private EstadoContenidoEnum(Integer valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }

    public Integer getValor() {
        return valor;
    }
    
    public String getTexto() {
        return texto;
    }
}
