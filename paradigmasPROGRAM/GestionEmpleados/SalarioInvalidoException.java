package GestionEmpleados;

public class SalarioInvalidoException extends IllegalArgumentException {
    public SalarioInvalidoException(String mensaje){
        super(mensaje);
    }
}
