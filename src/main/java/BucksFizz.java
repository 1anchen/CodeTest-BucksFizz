import java.util.ArrayList;

public class BucksFizz {

    private int counter;
    private ArrayList<String> result;


    public BucksFizz(int number){
        this.counter = number;
        this.result = new ArrayList<>();
    }

    public int getCounter() {
        return this.counter;
    }


    public ArrayList<String> getResult() {
        return result;
    }

    public void runCounter(){
        for(Integer i=1; i<=this.counter; i++){
            if(i%15==0) {
                this.convertBucksFizz(i);
            }else if(i%3==0) {
                this.convertBucks(i);
            }else if(i%5==0) {
                this.convertFizz(i);
            }else {
                this.convertNormalNumber(i);
            }
        }
    }

    public void convertBucks(int number){
            this.result.add("Bucks");

    }

    public void convertFizz(int number){
            this.result.add("Fizz");
    }

    public void convertBucksFizz(int number){
            this.result.add("BucksFizz");
    }

    public void convertNormalNumber(Integer number){
            String convertedNumber = number.toString();
            this.result.add(convertedNumber);
    }




}
