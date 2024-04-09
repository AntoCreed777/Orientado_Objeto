import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
        return list.remove(0);
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

abstract class Moneda{
    protected int valor;

    public Moneda(int v){
        valor = v;
    }

    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();
}

class Moneda1500 extends Moneda{
    public Moneda1500(){super(1500);}
    public int getValor(){
        return valor;
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){super(1000);}
    public int getValor(){
        return valor;
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){super(500);}
    public int getValor(){
        return valor;
    }
}

class Moneda100 extends Moneda{
    public  Moneda100(){super(100);}
    public int getValor(){
        return valor;
    }
}