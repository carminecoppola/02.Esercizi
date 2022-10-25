public class DataSet {
    public DataSet(){
        sum = 0;
        count = 0;
    }
    public void add(Measurable x){

        sum = sum + x.getMeasure();
        if (count == 0 || maximum.getMeasure() < x.getMeasure()){
            maximum = x;
            count++;
        }
    }

    public  Measurable getMaximum(){
        return maximum;
    }
    public double getMedia(){
        if (count == 0){
            return 0;
        }
        else {
            return sum/count;
        }
    }


    private double sum;
    private Measurable maximum;
    private int count;

}
