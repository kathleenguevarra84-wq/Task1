package chapter1;

public class InstanceIniLesson {
    int code = 1;
    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();
        System.out.println(ini.code);
        System.out.println ("feathers");
    }
        {
        System.out.println("Snowy");
        code = 214234234;
        System.out.println(code);
        }
        InstanceIniLesson(){
            code = 0;}
        
}   
class Chick{
    private String name = "Fluffy";
    {System.out.println("setting field");}
    public Chick(){
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}