import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
    }
}

class Moneda{
    public Moneda(){}
    public getSerie(){}
    public getValor(){}
}

class Bebida{
    private int serie;
    public Bebida(int a){
        serie = a;
    }
    public beber(){}
    public int getSerie(){
        return serie;
    }
}

class Deposito{
    private ArrayList<Bebida> list;

    public Deposito(){
        list = new ArrayList<Bebida>();
    }

    public Bebida get(){
        if(list.size() != 0){
            return list.remove(0);
        }
        else{
            return null;
        }
    }
    
    public void add(int serie){
        list.add(new Bebida(serie));
    }
}

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito monVu;

    public Expendedor(){}
    public Bebida comprarBebida(Moneda moneda,int tipo){
        switch (tipo) {
            case 1: 
                Bebida aux = coca.get();
                if(aux != null){
                    return aux;
                }
            case 2: return sprite.get();
            case 3: return monVu.get();
            default:
                return null;
        }
    }
    public getVuelto(){}
}

class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(){}
    public cuantoVuelto(){}
    public queBebiste(){}
}