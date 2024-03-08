package include;
public class Padre extends Persona{
    private String son;
    public Padre(String name,int age, String son){
        super(name,age);
        this.son = son;
    }

    public String getSon(){
        return son;
    }
}
