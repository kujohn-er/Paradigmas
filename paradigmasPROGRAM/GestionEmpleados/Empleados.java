package GestionEmpleados;

public abstract class Empleados {
    private String nombre;
    private Double salario;

    public Empleados(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public abstract void calcularSalario();
    
}
