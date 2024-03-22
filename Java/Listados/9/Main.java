public class Main {
    public static void main(String[] args) {
        PrimeraClase clase = new PrimeraClase("hola");
        String s = clase.getString();
        System.out.println(s);
    }
}

class PrimeraClase {
    private String s;
    
    public PrimeraClase(String s){
        this.s = s;
    }

    public String getString(){
        return s;
    }
}