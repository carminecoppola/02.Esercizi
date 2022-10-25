public class Coin implements Measurable{
    public Coin(double amm){
        value = amm;

    }
    public double getMeasure(){
        return value;
    }
    private double value;
}
