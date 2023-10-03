import java.lang.Thread;

public class Mars{

    public static void main(String[] args) throws InterruptedException {
        
        String colonyName = "Rissaland";
        String landingLocation = "The hill";
        int shipPopulation = 300;
        double meals = 4000.00;
        double mealRationSize = 0.75;
        boolean landing = true;
        

        //calculate meals after 2 day landing
        meals = meals - (shipPopulation*mealRationSize*2);
        System.out.println("Remaining meals: " + meals);

        //calculate meals after crate of food found
        meals = meals*1.5;

        //calculate pop after 5 babies born
        shipPopulation = shipPopulation + 5;

        //check landing location
        if (landingLocation.equalsIgnoreCase("The plain")){
            System.out.println("\nBbzzz Landing on the Plain\n");
        }
        else {
            System.out.println("\nERROR!!! Flight plan already set. Landing on the Plain\n");
        }
        
        //landingCheck function call
        landing = landingCheck(37);

        GuessingGame game = new GuessingGame();
        MarsExpedition expedition = new MarsExpedition();
        FindingsList findings = new FindingsList();


        game.playerName();
        game.playerGuess();
        
        expedition.welcome();
        expedition.crewSize();
        expedition.snacking();
        expedition.vehicle();
        expedition.sendOff();

        findings.addRocks();
        findings.storingFossils();
        findings.itemList();

    }
    
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int i = 0; i <= minutesLeft; i++){
            Thread.sleep(250);
            
            if(i%2 == 0 && i%3 == 0){
                System.out.println("Keep Center");
            }
            else if (i%2 == 0){
                System.out.println("Right");
            }
            else if (i%3 == 0){
                System.out.println("Left");
            }
            else{
                System.out.println("Calculating...");
            }
        }

        System.out.println("Landed");
        return false;
        }
}