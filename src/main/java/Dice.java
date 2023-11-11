import java.util.Random;

public class Dice {
    int numberOfDice ;


    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
    public Integer tossAndSum(){
        Integer sum = 0;
        Random random = new Random();
        for(int i = 0; i <numberOfDice; i++){
            sum += random.nextInt(6)+1;

        }
        return sum;
    }
}
