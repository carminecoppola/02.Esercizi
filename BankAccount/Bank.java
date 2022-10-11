public class Bank {
    private BankAccount[] banca;
    private static double totBil=0;

    //Costruttore
    public Bank(){
        banca = new BankAccount[5];
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
            banca[i] = new BankAccount();
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

}
