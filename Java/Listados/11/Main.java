public class Main {
    public static void main(String[] args) {
        OtraClase clase = new OtraClase(0);
        System.out.println(clase.sacaDato());
    }
}

class OtraClase{
    private int numero;

    public OtraClase(int numero){
        this.numero = numero;
    }

    public int sacaDato(){
        return numero;
    }
}