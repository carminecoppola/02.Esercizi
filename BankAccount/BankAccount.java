/*Implementare una classe BankAccount che permette di gestire un conto bancario 
  contenente un saldo che può essere modificato da depositi e prelievi costruttore
   1)Metodo deposit per versare denaro nel conto bancario
   2)Metodo withdraw preleva denaro dal conto bancario
   3)Metodo getBalance ritorna il saldo attuale 

   Implementare una classe BankAccountTest per il collaudo della classe BankAccount
    1)Inserimento denaro
    2)Prelievo
    3)Stampa Saldo

-----------------------------------------------------------------------------------------------------------
    In BankAccount creare due variabili tramite classi anonime
        - JPYConverter di tipo CurrencyConverter:
             1 USD = 139,96 JPY(yen)
        - GBPConverter di tipo CurrencyConverter:
             1 USD = 0,85 GBP(sterlina)
    Inserire un  metodo convertTO che capisca tramite enumeration il tipo di conversione da eseguire:
        - enum Currency{...}
*/

public class BankAccount implements Measurable{
        private  int num_conto,cont_dep;
        private static int n = 0;
        private double saldo;
        private static BankAccount[] array;
        private boolean tassa;
        private static double dollaro = 0.97;

        //Costruttore
    public BankAccount(double quant){
        num_conto = n++;     //Numero di conto
        saldo = quant;    //Saldo
        cont_dep = 0;    //Contatore dei depositi

    }

    //Costruttore implicito
    public BankAccount(){
        this(0.0);
    }

    //Deposito
    public void  deposit(double qt){
        saldo = saldo+qt;
        cont_dep++;
    }
    //Prelievo
    public void withdraw(double qt){
        try {
            //Controllo sullo stato del saldo
            //Se la quantità da prelevare è maggiore
            //del saldo allora si crea l'eccezzione
            if (qt > this.getBalance()){
                throw new NoFundsException();
            }
            saldo = saldo-qt;
        }
        catch (NoFundsException exc){
            System.out.println(exc.toString());
        }
    }

    //Saldo
    public double getBalance(){
        return saldo;
    }

    public int getContDep() {
        return cont_dep;
    }

    public String printConto(){
        String formattedNumber = String.format("%010d", num_conto);
        //System.out.println("\nQuesto è il numero conto: " + formattedNumber);
        return formattedNumber;
    }

    //Setto il valore di tass
    public void setTassa(boolean tassa) {
        this.tassa = tassa;
    }

    //Controllo se il conto è gia stato tassato
    public boolean isTass(){
        if (tassa)
            return tassa = true;
        return tassa;
    }

    public double convert(){
        return getBalance() * dollaro;
    }

    public double getMeasure(){
        return saldo;
    }

    //Variaili di classi anonime
    //1 USD = 139,96 JPY(yen)
    CurrencyConverter JPYConverter = new CurrencyConverter() {
        @Override
        public double convert(double qt) {
            qt = qt * 139.96;
            return qt;
        }
    };

    //1 USD = 0,85 GBP(sterlina)
    CurrencyConverter GBPConverter = new CurrencyConverter() {
        @Override
        public double convert(double qt) {
            qt = qt *0.85;
            return qt;
        }
    };
    /*Ad entrambe bisogna passare un parametro in input poiche nel loro metodo
      prendono una quantità in input, anche essendo una get() */
    public double getGBP(double qt){
        return GBPConverter.convert(qt);
    }
    public double getYEN(double qt){
        return JPYConverter.convert(qt);
    }

    /*Enumerazione per capire automaticamente che conversione utilizzare*/


    private EURConverter euro = new EURConverter();
    public void convertTo(Currency value){
        switch (value){

            case EURO:
                System.out.println("Questa è la conversione in euro: " + euro.convert(this.getMeasure()));
                break;
            case YEN:
                System.out.println("Questa è la conversione in YEN: " + JPYConverter.convert(this.getMeasure()));
                break;
            case STERLINE:
                System.out.println("Questa è la conversione in STERLINE: " + GBPConverter.convert(this.getMeasure()));
                break;
            default:
                System.out.println("Saldo non convertibile");
                break;
        }
    };

}
