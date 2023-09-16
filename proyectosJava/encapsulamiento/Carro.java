package encapsulamiento;
//creamos una clase llamada carro que sera nuestro objeto
public class Carro {
    //declaramos variables privadas para este objeto
    private String marca;
    private int modelo;

    //creamos su contructor
    public Carro(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //creamos metodos get y set de ambas variables
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    //restringimos el modelo por medio de una condicional
    public void setModelo(int modelo) {
        if (modelo >= 1860) {
            this.modelo = modelo;
        } else {
            System.out.println("no existen automoviles de ese modelo");
        }
    
    }

    //metodo para obtener la informacion de los carros
    public String mostrarCarro(){
        return (marca+" "+modelo);
    }
}
