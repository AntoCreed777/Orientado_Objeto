public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", false);
        Persona p2 = new Persona("Felipe", true);

        System.out.println(p1.esCasado());
        System.out.println(p1.elNombre());
        System.out.println(p2.esCasado());
        System.out.println(p2.elNombre());
    }
}

class Persona{
    private String nombre;
    private boolean estado;

    public Persona(String nombre, boolean estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    public boolean esCasado(){
        return estado;
    }

    public String elNombre(){
        return nombre;
    }
}