package examen;

public class EmpleadoVendedor extends Empleado{
    double montoVendido;
    double tasaComision;

    public EmpleadoVendedor(String RFC, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(RFC, apellidos, nombres);
        this.montoVendido=montoVendido;
        this.tasaComision=tasaComision;
    }
    

    public double getMontoVendido() {
        return montoVendido;
    }


    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }


    public double getTasaComision() {
        return tasaComision;
    }


    public void setTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }


    public double ingresos(){
        return getTasaComision()*getMontoVendido();
    }

    public double calcularBonificacion() {
        if (montoVendido < 1000) {
            return 0;
        } else if (montoVendido >= 1000 && montoVendido <= 5000) {
            return 0.05 * ingresos();
        } else {
            return 0.10 * ingresos();
        }
    }

    public double calcularDescuento() {
        double ingresos = ingresos();
        if (ingresos < 1000) {
            return 0.11 * ingresos;
        } else {
            return 0.15 * ingresos;
        }
    }

    public double calcularSueldoNeto() {
        return ingresos() + calcularBonificacion() - calcularDescuento();
    }

}
