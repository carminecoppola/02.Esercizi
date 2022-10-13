public class CheckingAccount extends BankAccount{
    private int transCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;
    //Costruttore
    public CheckingAccount(int initialBalance){
        super(initialBalance); //Costruzione della superclasse
        transCount=0;          //Inizializziamo il contatore delle transazioni
    }

    //Ridefiniamo i metodi della superclasse
    public void deposit(double qt)
    {  transCount++;
        // ora somma l'importo al saldo
        super.deposit(qt);
    }

    public void withdraw(double qt)
    {  transCount++;
        // ora sottrae l'importo dal saldo
        super.withdraw(qt);
    }

    //Metodo per il calcolo delle commissioni
    public void deductFees(){
        if (transCount > FREE_TRANSACTIONS){
            double fees = TRANSACTION_FEE * (transCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transCount = 0;
    }
}//Fine classe