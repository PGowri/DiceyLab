public class Simulation {
    int numberOfDies ;
    int numberOfTosses;

    Bins bins ;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(this.numberOfDies, this.numberOfDies*6);
    }
    public void runSimulation(){
        Dice dice = new Dice(this.numberOfDies);
        bins = new Bins(this.numberOfDies, this.numberOfDies * 6);
        for(int i = 0; i<this.numberOfTosses; i++){
        bins.incrementBin(dice.tossAndSum());

        }
//        for(int i =2; i<=numberOfDies*6; i++){
//            System.out.println("values at bin number" + i + ": " + bins.getBin(i));
//        }
    }



public void printResults() {
    System.out.println("***");
    System.out.println("Simulation of " + this.numberOfDies + "dice tossed for" + this.numberOfTosses + "times");
    System.out.println("***");

    for(int i = numberOfDies; i<=numberOfDies*6; i++){
        //value:     #tossedThatValue: percentage **************
        String str = String.format("%2d :%9d:  %1.2f", i, bins.getBin(i),(double)this.bins.getBin(i)/numberOfTosses);
        //stars
        double percent = (double)this.bins.getBin(i)/this.numberOfTosses;
        int num = (int)(percent * 100);
        String stars = "*".repeat(num);
        System.out.println(str + " " + stars);

        // _ _ _
        //_ _ 1
        //_ 0 1 the way string format works for %3d
    }

}
}