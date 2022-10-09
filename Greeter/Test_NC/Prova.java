public class Prova{

    public String sayHello(){
        String messaggio = "Ciao,sono "+nome+cognome +"!";
        return messaggio;
    }
    public Prova(String n, String c){
        nome=n;
        cognome=c;
    } 

    private String nome,cognome;
}