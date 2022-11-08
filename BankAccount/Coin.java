public class Coin implements Measurable{
    public Coin(double amm){
        value = amm;
    }
    public double getMeasure(){
        return value;
    }

    @Override
    public boolean equals(Object obj){
        Coin prova = (Coin)obj;
        if (prova.getMeasure()==this.getMeasure())
            return true;

        return false;
    }
    private double value;
}
