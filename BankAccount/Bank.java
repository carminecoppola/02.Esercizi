/* Modificare BankAccount e SavingAccount inserendo un array di conti correnti. Calcolare :
        - Bilancio totale della banca;
        - Contare il numero di depositi
        - Stampare il numero di conto corrente usando sempre 10 cifre
        - Tassare i conti corrente con più di 5000€
        - Convertire la valuta di un singolo conto corrente
*/

public class Bank {
    private SavingsAccount[] banca;
    private static double totBil=0;
    private int totDep=0;


    //Costruttore
    public Bank(){
        banca = new SavingsAccount[5];
        buildArray();
    }

    //Metodo di getter
    public BankAccount getBanca(int i) {
        return banca[i];
    }

    //Qui eseguiamo la creazione dell'array
    //instanziando una ogni nuova cella dell'array
    // di tipo BankAccount()
    private void buildArray(){
        for (int i=0;i<banca.length;i++){
            banca[i] = new SavingsAccount(10);
        }
    }

    //In questo metodo andiamo a sommare i bilanci dei
    //vari conti bancari presenti in ogni cella dell'array
    public double totBilancio(){
        for (int i=0;i<banca.length;i++){
            totBil += banca[i].getBalance();
        }
        return totBil;
    }

    //Calcola il totale di depositi effettuati nella banca
    public int totDepositi(){
        for (int i=0;i<banca.length;i++){
            totDep += banca[i].getContDep();
        }
        return totDep;
    }

    public void tassamento(double tx) {
        for (int i = 0; i < banca.length; i++) {
            if (banca[i].getBalance() >= 5000 && !banca[i].isTass()) {
                banca[i].withdraw(tx);
                banca[i].setTassa(true);
                System.out.println("Account numero "+ banca[i].printConto() +" è stato tassato");
            }
        }
    }


}//Fine Classe
