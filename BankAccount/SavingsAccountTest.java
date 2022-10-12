public class SavingsAccountTest{
    public static void main(String[] args) {

        Bank fineco = new Bank();   //Crazione dell' array di tipo banca

        //Prima persona che effettua operazioni
        fineco.getBanca(1).deposit(100);
        fineco.getBanca(1).deposit(700);
        System.out.println("Bilancio della Persona 1: "+fineco.getBanca(1).getBalance());
        //Seconda persona che effettua operazioni
        fineco.getBanca(2).deposit(505);
        fineco.getBanca(2).withdraw(200);
        System.out.println("Bilancio della Persona 2: "+fineco.getBanca(2).getBalance());
        System.out.println("Questo è il bilancio di tutti i conti della banca: "+fineco.totBilancio());

        System.out.println("Questo è il numero di depositi avvenuti nella banca:"+fineco.totDepositi());

        //Aggiunta del tasso di interesse
        //prova.addInterest();
        //System.out.println("Interesse: " +prova.getBalance());


    }
}