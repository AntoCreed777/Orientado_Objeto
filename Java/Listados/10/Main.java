public class Main {
    public static void main(String[] args) {
        Bebida b = new Bebida();
        String s = new String(b.beber());
        System.out.println(s);
    }
}

class Bebida {
    public Bebida() {
    }

    public String beber() {
        return new String("gluglu");
    }
}