public class SaveAccount extends BankAccount{

    private double interesse;

    //Costruttore
    public SaveAccount(double f){
        interesse = f;
    } 


    //Metodo aggiunta interesse
    public void addInteres(){
        this.deposit(this.getBalance()*interesse/100);
    }

}//Fine classe