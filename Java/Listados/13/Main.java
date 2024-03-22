public class Main {
    public static void main(String[] args) {
        Bebida b1 = new Bebida(true);

        System.out.println(b1.beber());
        System.out.println(b1.beber());
    }
}

class Bebida {
    private boolean llena;

    public Bebida(boolean llena) {
        this.llena = llena;
    }

    public String beber() {
        if (llena == true) {
            llena = false;
            return new String("gluglu");
        }
        else {
            return null;
        }
    }
}