/*Implementare una classe BankAccountTest per il collaudo della classe BankAccount
    1)Inserimento denaro
    2)Prelievo
    3)Stampa Saldo 
*/

public class TestBankAccount{

    public static void main(String[] args) {
        
        BankAccount test = new BankAccount( 10);

        //System.out.println("Il saldo dopo il deposito è: " + test.getBalance());
        //System.out.println("Il saldo dopo il prelievo è: " + test.withdraw(100));
        //System.out.println("Il tuo saldo: " + test.getBalance());

        test.deposit(20);
        System.out.println("Il sado dopo il deposito è: " + test.getBalance());
        test.withdraw(500);
        System.out.println("Il bilancio dopo il prelievo è: "+test.getBalance());

    }
}
