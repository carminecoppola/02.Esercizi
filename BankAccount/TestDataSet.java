public class TestDataSet {
    public static void main(String[] args) {

        DataSet Account = new DataSet();

        Account.add(new BankAccount(100));
        Account.add(new BankAccount(200));
        Account.add(new BankAccount(300));

        System.out.println("\nLa media degli Account è:" +Account.getMedia());
        Measurable max = Account.getMaximum();
        System.out.println("Il massimo degli account è: "+max.getMeasure());

        DataSet monete = new DataSet();
        monete.add(new Coin(400));
        monete.add(new Coin(600));

        System.out.println("\nLa media dei Coin è:"+monete.getMedia());
        max = monete.getMaximum();
        System.out.println("Il massimo dei Coin è: "+max.getMeasure());


    }


}
