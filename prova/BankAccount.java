public class BankAccount { 

    //Deposito
    public int deposit(int qt){
        saldo = saldo+qt;
        return saldo;
    }
    //Prelievo
    public int withdraw(int qt){
        saldo = saldo-qt;
        return saldo;
    }
    //Saldo
    public int getBalance(){
        return saldo;
    }

    //Costruttore
    public BankAccount( int quant){
        saldo=500;   //Saldo
        qt=quant;  //Quantita da sommare o sottrarre
    }
    private int qt;
    private int saldo;
}
