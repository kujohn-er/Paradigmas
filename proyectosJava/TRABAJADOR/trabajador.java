package TRABAJADOR;

public class trabajador {
    private String nombre, puesto;
    private int edad;
    private double sueldo;
    
    public trabajador(String nombre, String puesto, int edad, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String toString(){
        return (nombre+"   "+edad+" "+puesto+"   "+sueldo);
    }
}


class obrero extends trabajador{

    public obrero(String nombre, int edad) {
        super(nombre, "obrero", edad, 2000);   
    }

}
class supervisor extends trabajador{

    public supervisor(String nombre, int edad) {
        super(nombre, "superv", edad, 3000);
        
    }

}
class gerente extends trabajador{

    public gerente(String nombre, int edad) {
        super(nombre, "gerent", edad, 5000);
    }

}
