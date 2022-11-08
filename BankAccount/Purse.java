import java.util.ArrayList;

public class Purse {

    private ArrayList<Coin> coins = new ArrayList();  //Array di tipo coin

    public void add(Coin valore){
        coins.add(valore);
    }

    //Metodo per calcolare l'iesmio valore del coin presente nell'array list
    public double getTotal(){
        double total = 0;

        for (int i = 0; i < coins.size();i++){
            total += coins.get(i).getMeasure();
        }
        return total;
    }

    public void count(){
        int count = 0;

        for (int i = 0; i< coins.size();i++){
            count++;
        }
        System.out.println("Il numero di monete che abbiamo è: "+count);
    }

    public boolean find(Coin value){

        return this.coins.contains(value);
    }

    public double count(Coin toCount){
        double count = 0;

        for (int i = 0; i < coins.size(); i++){
            if (coins.equals(toCount)){
                count++;
            }
        }
        return count;
    }

    public Coin maximum(){
        Coin max = coins.get(0);

        for (int i = 1; i < coins.size();i++){
            if (coins.get(i).getMeasure() > max.getMeasure())
                max = coins.get(i);
        }
        return max;
    }

}//Fine classe
