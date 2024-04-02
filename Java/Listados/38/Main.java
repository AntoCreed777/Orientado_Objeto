public class Main {
    public static void main(String[] args) {
        CuatroOperaciones c = new CuatroOperaciones(4, 2);
        System.out.println(c.suma());
        System.out.println(c.resta());
        System.out.println(c.multiplica());
        System.out.println(c.divide());
    }
    
}


class SumaResta{
    protected float uno;
    protected float dos;

    public SumaResta(float a, float b){
        uno = a;
        dos = b;
    }
    public float suma(){
        return uno + dos;
    }
    public float resta(){
        return uno - dos;
    }

}

class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float a, float b){
        super(a, b);
    }
    public float multiplica(){
        return uno * dos;
    }
    public float divide(){
        return uno / dos;
    }
}