public class Main {
    public static void main(String[] args) {
        Bebida b = new Bebida(1);

        b.llenar(5);
        int aux;

        aux = b.beber(4);
        System.out.println(aux);

        aux = b.beber(1);
        System.out.println(aux);

        System.out.println(b.getSerie());
    }
}

class Bebida {
    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;

    public Bebida(int s) {
        serie = s;
    }

    public int getSerie() {
        return serie;
    }

    public void llenar(int a) {
        if(a>=0){
            if (a <= Bebida.VOLUMEN) {
                contenido = a;
            } else {
                contenido = Bebida.VOLUMEN;
            }
        }
    }

    public int beber(int a){
        int aux = contenido;
        if(a>contenido){contenido = 0;return aux;}
        else{contenido-=a;return a;}
        
    }
}