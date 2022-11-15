/*Implementare una classe BankAccountTest per il collaudo della classe BankAccount
    1)Inserimento denaro
    2)Prelievo
    3)Stampa Saldo 
*/

public class TestBankAccount{

    public static void main(String[] args) {
        
        BankAccount test = new BankAccount( 10);
        EURConverter test2 = new EURConverter();


        //System.out.println("Il saldo dopo il deposito è: " + test.getBalance());
        //System.out.println("Il saldo dopo il prelievo è: " + test.withdraw(100));
        //System.out.println("Il tuo saldo: " + test.getBalance());

        //Gestione Eccezzioni
        /*test.deposit(20);
        System.out.println("Il sado dopo il deposito è: " + test.getBalance());
        test.withdraw(500);
        System.out.println("Il bilancio dopo il prelievo è: "+test.getBalance());
        */

        //Converter
        /*System.out.println("Il valore 2 convertito in EURO è: " + test2.convert(2) + " € ");
        System.out.println("Il valore 2 in YEN è: " + test.getYEN(2)+ " ¥ ");
        System.out.println("Il valore 2 in GBP è: " + test.getGBP(2)+ " £  ");
        */
        //TEST SWITCH

        test.convertTo(Currency.EURO);
    }
}
