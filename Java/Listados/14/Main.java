public class Main {
    public static void main(String[] args) {
        Promediador p = new Promediador();
        p.agregaNumero(1);
        p.agregaNumero(1);
        p.agregaNumero(1);
        p.agregaNumero(1);
        p.agregaNumero(1);

        System.out.println(p.promedio());
        System.out.println(p.numero());
    }
}

class Promediador{
    private int s;
    private int n;

    public Promediador(){
        this.s = 0;
        this.n = 0;
    }

    public void agregaNumero(int numero){
        this.s = this.s + numero;
        this.n++;
    }

    public float promedio(){
        return (float)s/n;
    }

    public int numero(){
        return n;
    }
}