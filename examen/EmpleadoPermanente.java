package examen;

public class EmpleadoPermanente extends Empleado{
    private double sueldoBase;
    private String numSeguroSocial;
    private double afiliacion;

    public EmpleadoPermanente(String RFC, String apellidos, String nombres, double sueldoBase, String numSeguroSocial) throws Exception {
        super(RFC, apellidos, nombres);
        if (sueldoBase < 150) {
            throw new Exception("El sueldo base no puede ser menor al mínimo de 150 pesos.");
        }
        this.sueldoBase = sueldoBase;
        this.numSeguroSocial = numSeguroSocial;
        this.afiliacion=afiliacion;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }


    public void setNumSeguroSocial(String numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }


    public double getAfiliacion() {
        return afiliacion;
    }


    public void setAfiliacion(double afiliacion) {
        this.afiliacion = afiliacion;
    }


    public double ingresos() {
        return sueldoBase;
    }

    public double calcularAfiliacion(){
        return afiliacion;
    }

    public double calcularDescuento() {
        double ingresos = ingresos();
        if (calcularAfiliacion() < (ingresos*.11)) {
            return 0.0;
        } else {
            return 0.11 * ingresos;
        }
    }

    public double calcularSueldoNeto(){
        return ingresos()-calcularDescuento();
    }
    
}

