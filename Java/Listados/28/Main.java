import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Moneda m1 = new Moneda();
        Moneda m2 = new Moneda();

        Expendedor ex = new Expendedor(5);

        System.out.println(ex.comprarBebida(m1).beber());
        System.out.println(ex.comprarBebida(m2).beber());


    }
}

class Moneda {
    public Moneda() {}
}

class Bebida {
    private int serie;

    public Bebida(int s) {
        serie = s;
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {
        return new String("gluglu");
    }
}

class Expendedor {
    private Deposito d;
    public Expendedor(int n) {
        d = new Deposito();
        for(int i=0;i<n;i++){
            d.addBebida(new Bebida(i));
        }
    }

    public Bebida comprarBebida(Moneda m) {
        return d.getBebida();
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