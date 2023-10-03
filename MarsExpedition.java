import java.util.Scanner;

public class MarsExpedition{
    Scanner scan = new Scanner(System.in);
        String userName;
        String userInput;
        String snack;
        String vehicleName;
        Boolean validResponse;
        int desiredCrewSize;
        int approvedCrewSize;
        int vehicleChoice;


    public MarsExpedition(){

        userName = "Stanley";
        userInput = "huh";
        snack = "peperoni";
        vehicleName = "Space Ferrari";
        validResponse = false;
        desiredCrewSize = 7;
        approvedCrewSize = 2;
        vehicleChoice = 1;
        
    }

    public static void main(String[] args){
    }

    public void welcome(){
        
        //bootup
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");   

        System.out.println("Please enter your name: ");
        userName = scan.nextLine();

        //welcome response
        while (!validResponse){
            
            System.out.println("\nWelcome " + userName + "! \nAre you ready to head out into the new world? Type Y or N");
            userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.\n");
            validResponse = true;
            }
            else if (userInput.equalsIgnoreCase("N")){
            System.out.println("Too bad you are team leader. You have to go.\n");
            validResponse = true;
             }
            else {
            System.out.println("please enter a valid response.\n");
            }

        }

    }

    public void crewSize(){

        System.out.println("How many crew memebers would you like to have on your team?");
        desiredCrewSize = scan.nextInt();
        scan.nextLine();

        if (desiredCrewSize > 2){
            System.out.println("Ummm... you can have 2\n");
            approvedCrewSize = 2;
        } else if (desiredCrewSize < 2){
            System.out.println("Are you crazy?? You need 2\n");
            approvedCrewSize = 2;
        }
        else {
            System.out.println("Perfect! Crew size approved\n");
            approvedCrewSize = 2;
        }
    }

        public void snacking(){
        System.out.println("What type of snack would you like for the trip?");
        snack = scan.nextLine();
        System.out.println("Great choice! We will have " + snack + " ready for you on the ship.\n");
            }

        public void vehicle(){

            System.out.println("Which vehicle will you be taking? \n 1. Space Ferrari \n 2. Mars Rover \n 3. Buggy \n 4. DeLorean");
            vehicleChoice = scan.nextInt();

            if (vehicleChoice >= 1 && vehicleChoice <= 4){
            switch(vehicleChoice){
                case 1:
                vehicleName = "Space Ferrari";
                case 2:
                vehicleName = "Mars Rover";
                case 3:
                vehicleName = "Buggy";
                case 4:
                vehicleName = "DeLorean";
                    }
            }
            else {
                System.out.println("Invalid vehicle choice");
                vehicleName = "Invalid Vehicle";
            }

            }

            public void sendOff(){

                        System.out.println("\n" + userName + " your " + vehicleName + " is ready. We packed " + snack + " for you, and your " + approvedCrewSize + " member crew is waiting.");

            }
    }