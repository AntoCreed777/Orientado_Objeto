import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deposito d1 = new Deposito();
        Deposito d2 = new Deposito();

        d1.addBebida(new Sprite(1));
        d1.addBebida(new Fanta(2));
        d1.addBebida(new Kem(3));
        d1.addBebida(new CocaCola(4));

        d2.addBebida(new Sprite(5));
        d2.addBebida(new Fanta(6));
        d2.addBebida(new Kem(7));
        d2.addBebida(new CocaCola(8));

        for(int i=0;i<5;i++){
            Bebida aux = d1.getBebida();
            if (aux != null){
                System.out.println(aux.getSerie());
                System.out.println(aux.beber());
            }
        }

        for(int i=0;i<5;i++){
            Bebida aux = d2.getBebida();
            if (aux != null){
                System.out.println(aux.getSerie());
                System.out.println(aux.beber());
            }
        }
    }
}

class Bebida{
    private int serie;
    public Bebida(int a){
        serie = a;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return new String("sabor: ");
    }
}

class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }
    public String beber(){
        return super.beber() + new String("sprite");
    }
}

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }
    public String beber(){
        return super.beber() + new String("fanta");
    }
}

class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }
    public String beber(){
        return super.beber() + new String("kem");
    }
}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }
    public String beber(){
        return super.beber() + new String("cocacola");
    }
}

class Deposito{
    private ArrayList<Bebida> list;

    public Deposito(){
        list = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a){
        list.add(a);
    }

    public Bebida getBebida(){
        if(list.size() == 0){return null;}
        Bebida aux = list.remove(0);
        return aux;
    }
}