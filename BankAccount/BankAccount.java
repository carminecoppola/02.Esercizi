/*Implementare una classe BankAccount che permette di gestire un conto bancario 
  contenente un saldo che può essere modificato da depositi e prelievi costruttore
   1)Metodo deposit per versare denaro nel conto bancario
   2)Metodo withdraw preleva denaro dal conto bancario
   3)Metodo getBalance ritorna il saldo attuale 

   Implementare una classe BankAccountTest per il collaudo della classe BankAccount
    1)Inserimento denaro
    2)Prelievo
    3)Stampa Saldo
*/

public class BankAccount { 

    //Costruttore
    public BankAccount(double quant){
        saldo = 500;   //Saldo
        qt = quant;  //Quantita da sommare o sottrarre
    }

    //Deposito
    public double deposit(double qt){
        saldo = saldo+qt;
        return saldo;
    }
    //Prelievo
    public double withdraw(double qt){
        saldo = saldo-qt;
        return saldo;
    }
    //Saldo
    public double getBalance(){
        return saldo;
    }

    //Costruttore implicito
    public BankAccount(){
        this(0.0);
    }
    private double qt;
    private double saldo;
}

