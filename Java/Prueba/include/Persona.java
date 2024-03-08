package include;
public class Persona {
    private String name;
    private int age;

    public Persona(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}