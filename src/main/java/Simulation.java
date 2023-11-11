public class Simulation {
    int numberOfDies ;
    int numberOfTosses;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;

    }
    public void runSimulation(){
        Dice dice = new Dice(this.numberOfDies);
        Bins bins = new Bins(this.numberOfDies, this.numberOfDies * 6);
        for(int i = 0; i<this.numberOfTosses; i++){
        bins.incrementBin(dice.tossAndSum());

        }
        for(int i =2; i<=numberOfDies*6; i++){
            System.out.println("values at bin number" + i + ": " + bins.getBin(i));
        }
    }

}
