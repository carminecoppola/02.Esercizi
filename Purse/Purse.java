public class Purse{

    public void addNickels(int n){
           nickles = nickles+n;
    }

    public void addDimes(int d){
        dimes = dimes + d;

    }

    public void addQuarter(int q){
        quarters = quarters + q;
    }

    public float getTotal(){
        //return nickles * 0.05 + dimes * 0.1 + quarters * 0.25; //Ovviamente cambia il tipo del metodo in double
        return (float)nickles * (float)0.05 + (float)dimes * (float)0.1+ (float)quarters * (float)0.25;
        //Cast
    }

    private int nickles = 0;
    private int dimes =0;
    private int quarters = 0;
}