//Lanciare l'errore sul metodo withdraw quando il saldo < 0
@SuppressWarnings("serial")
public class NoFundsException extends Exception{
    public NoFundsException(){
        super("Il conto è in rosso");
    }

    public String toString(){
        return getMessage() + " Saldo negativo ";
    }
}
