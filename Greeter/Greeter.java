public class Greeter{

    public Greeter(String aName){
        name = aName;
    }

    public String sayHello(){
        String message = "Hello " + name + "!";
        return message;
    }

    private String name;
}