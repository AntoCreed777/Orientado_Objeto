public class Main {
    public static void main(String[] args) {
        Moneda m1 = new Moneda();
        Expendedor ex = new Expendedor();

        Bebida b1 = ex.comprarBebida(m1);

        System.out.println(b1.beber());
    }
}

class Moneda{
    public Moneda(){}
}

class Bebida{
    public Bebida(){}
    public String beber(){
        return new String("gluglu");
    }
}

class Expendedor{
    public Expendedor(){}
    public Bebida comprarBebida(Moneda m){
        return new Bebida();
    }
}