import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor ex = new Expendedor(5);
        for(int i=0; i<6; i++){
            Bebida aux = ex.comprarBebida(new Moneda(), 1);
            if(aux != null){
                System.out.println(aux.getSerie());
                System.out.println(aux.beber());
            }
        }
    }
}

abstract class Bebida{
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

class Expendedor{
    private Deposito coca;
    private Deposito sprite;

    public Expendedor(int cantidad){
        coca = new Deposito();
        sprite = new Deposito();

        for(int i=0; i<cantidad; i++){
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
        }
    }

    public Bebida comprarBebida(Moneda moneda, int tipo){
        switch (tipo) {
            case 1:
                return coca.getBebida();
            case 2:
                return sprite.getBebida();
            default:
                return null;
        }
    }
}

class Moneda{}