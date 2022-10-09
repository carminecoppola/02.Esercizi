public class Greeter2{

    public String sayHello(){
        String message = "Hello,"+name+"!";
        return message;
    }
public Greeter2(String s){
    //Costruttore 
    name = s;
}
private String name;
}