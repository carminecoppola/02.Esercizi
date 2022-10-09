public class SavingsAccount extends BankAccount{

    private double interesse;

    //Costruttore
    public SavingsAccount(double f){
            interesse = f;
    }
    public void addInterest(){
        this.deposit(this.getBalance()*interesse/100);
        }
    }
