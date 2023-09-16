package GestionEmpleados;

public class EmpleadoAsalariado extends Empleados implements Bonificable{
    private int diasTrabajados;

    public EmpleadoAsalariado(String nombre, Double salario, int diasTrabajados) {
        super(nombre,salario);

        if(salario<0){
            throw new SalarioInvalidoException("el salario del empleado debe ser mayo que 0");
        }

        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public void calcularSalario() {
        System.out.println((diasTrabajados*getSalario()));

    }

    @Override
    public void calcularBonificacion() {
        
        if (diasTrabajados>30) {
            System.out.println("tu bonificacion es de 1500.00 por lo tanto el sueldo total es: ");
            System.out.println((diasTrabajados*getSalario())+1500.00);
        } else {
            System.out.println("no hay bonificacion disponible");
        }
    }
    public String mostrarInformacion(){
        return "Empleado: " + getNombre() + ", Salario: " + getSalario() + ", dias trabajados: " +
        getDiasTrabajados();
    }
    
    
}