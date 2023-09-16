package videojuego;
//creamos la clase principal Personaje
public abstract class Personaje {
    String nombre;
    int nivel;
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    //estos metodos son parte del polimorfismo, pues cada npc lo ocuparia en un videojuego
    public void atacar() throws RuntimeException{
        if (nivel<5) {
            throw new RuntimeException("no tienes nivel suficiente para atacar");
        }
    }
        public void gritar(){
        System.out.println("aaaaaghhh!!");
    }
    public void ValidarNivel() throws IllegalArgumentException{
        if (nivel < 1) {
            throw new IllegalArgumentException("el nivel no puede ser menor a 1");
                  
        }
    }
}

interface HabilidadesMagicas{
    void habilidadEspecial();
}
interface HabilidadesFisicas{
    void atacar();
    void ataqueSuper();
}

//esta el la clase jugador
class Jugador extends Personaje implements HabilidadesFisicas, HabilidadesMagicas{

    public Jugador(String nombre,String clase, int nivel) {
        super(nombre, nivel);

    }
    //estos metodos son parte del polimorfismo, pues se diferenciaran en lo que dicen solamente
    public void atacar() throws RuntimeException{
        if (nivel<5) {
            throw new RuntimeException("no tienes nivel suficiente para atacar");
        }
        System.out.println(getNombre()+" lanza un ataque");
    }

    @Override
    public void ataqueSuper() {

        System.out.println("el jugador uso un ataque super");
    }
    @Override
    public void habilidadEspecial() {

        System.out.println("el jugador ha usado una habilidad especial");
    }
}

class Enemigo extends Personaje implements HabilidadesFisicas{

    public Enemigo(String nombre, String mob, int nivel) {
        super(nombre, nivel);
    }
    public void gritar(){
        System.out.println("aaaaaaaghhh!!!!!!");
    }
    @Override
    public void ataqueSuper() {
        System.out.println("el enemigo te ha lanzado un super ataque");
    }
    
}