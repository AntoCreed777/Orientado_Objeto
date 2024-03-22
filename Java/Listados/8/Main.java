public class Main {
    public static void main(String[] args) {
        Balde b = new Balde();

        int litros = 12;
        b.llenar(litros);

        int contenido = b.verificar();
        System.out.println(contenido);
    }
}

class Balde {
    private int contenido;

    public Balde() {}

    public void llenar(int contenido) {
        if (this.contenido + contenido <= 12) {
            this.contenido = this.contenido + contenido;
        }
        else{this.contenido = 12;}
    }

    public int verificar() {
        return contenido;
    }
}