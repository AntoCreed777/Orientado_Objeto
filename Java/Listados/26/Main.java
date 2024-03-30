import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bebida b1 = new Bebida(1121);

        Deposito d1 = new Deposito();

        d1.addBebida(b1);
        System.out.println(d1.getBebida().getSerie());
    }
}

class Bebida {
    private int serie;

    public Bebida(int s) {
        serie = s;
    }

    public int getSerie() {
        return serie;
    }

    public void beber() {
    }
}

class Deposito {
    private ArrayList<Bebida> a;

    public Deposito() {
        a = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        a.add(b);
    }

    public Bebida getBebida() {
        if (a.size() != 0) {
            Bebida aux = a.get(0);
            a.remove(0);
            return aux;
        }
        return null;
    }
}