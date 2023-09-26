package examen;

public class Empleado {
    private String RFC;
    private String apellidos;
    private String nombres;
    
    public Empleado(String RFC, String apellidos, String nombres) {
        this.RFC = RFC;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getRFC() {
        return RFC;
    }
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void mostrarInfo(){
        System.out.println("empleado: "+getNombres()+" "+getApellidos()+" con RFC: "+getRFC());
    }

}



