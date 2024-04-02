public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<5; i++){
            CreaYPruebaBebida.pruebaVeSerieBeber(i, 123);
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

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }
    public String beber(){
        return new String("fanta");
    }
}

class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }
    public String beber(){
        return new String("kem");
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

class CreaYPruebaBebida{
      public static void pruebaVeSerieBeber(int que, int serie){
          Bebida b=null;
          switch (que){
              case 1:  b = new Sprite(serie); break;
              case 2:  b = new Fanta(serie); break;
              case 3:  b = new Kem(serie); break;
              case 4:  b = new CocaCola(serie); break;
              default: return;
          }
          System.out.println(b.getSerie()+": "+b.beber());  
      }
}