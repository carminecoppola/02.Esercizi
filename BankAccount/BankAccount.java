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

