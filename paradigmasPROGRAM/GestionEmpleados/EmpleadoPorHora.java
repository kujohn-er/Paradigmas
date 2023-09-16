package GestionEmpleados;

public class EmpleadoPorHora extends Empleados{
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, Double salario, int horasTrabajadas) {
        super(nombre, salario);

        if(salario<0){
            throw new SalarioInvalidoException("el salario del empleado debe ser mayo que 0");
        }
        
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularSalario() {
        System.out.println(horasTrabajadas*getSalario());
        //CAMBIAR: deberia ser horas trabajados*el salario(cuanto pagan por hora a este tipo de empleados)
    }
    
    
    public String mostrarInformacion(){
        return "Empleado: " + getNombre() + ", Salario: " + getSalario() + ", dias trabajados: " +
        getHorasTrabajadas();
    }

    
}
