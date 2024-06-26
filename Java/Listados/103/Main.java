import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1, 1000);

        Comprador comprador = null;
        comprador = new Comprador(new Moneda1000(), 1, exp);
        System.out.println(comprador.queBebiste()+", "+comprador.cuantoVuelto());

        comprador = new Comprador(new Moneda1000(), 1, exp);
        System.out.println(comprador.queBebiste()+", "+comprador.cuantoVuelto());

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
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }
    public String beber(){
        return new String("sprite");
    }
}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }
    public String beber(){
        return new String("cocacola");
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
    private DepositoM monVu;
    private int presio;

    public static final int  COCA=1;
    public static final int  SPRITE=2;

    public Expendedor(int numBebidas, int presioBebidas){
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();

        presio = presioBebidas;

        for(int i=0; i<numBebidas; i++){
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
        }
    }

    public Bebida comprarBebida(Moneda moneda, int tipo){
        if(moneda.getValor() < presio){
            monVu.addMoneda(moneda);
            return null;
        }
        for(int i = moneda.getValor()-presio;i>0;i-=100){
            monVu.addMoneda(new Moneda100());
        }
        switch (tipo) {
            case COCA:
                return coca.getBebida();
            case SPRITE:
                return sprite.getBebida();
            default:
                return null;
        }
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}

class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida aux = exp.comprarBebida(m, cualBebida);
        if(aux !=null){
            sonido = aux.beber();
            vuelto = 0;
            do{
                Moneda auxM = exp.getVuelto();
                if(auxM == null){break;}
                vuelto += auxM.getValor();
            }while(true);
        }
        else{
            sonido = null;
            vuelto = exp.getVuelto().getValor();
        }

    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
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

class DepositoM{
    private ArrayList<Moneda> list;

    public DepositoM(){
        list = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a){
        list.add(a);
    }

    public Moneda getMoneda(){
        if(list.size() == 0){return null;}
        return list.remove(0);
    }
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