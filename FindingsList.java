import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
        Scanner scan;
        String userChoice;
        ArrayList<String> rocks;

    public FindingsList(){
        scan = new Scanner(System.in);
        rocks = new ArrayList<String>();
        userChoice = "";
 }

public static void main(String[] args){
}

    public FindingsList(String choice, ArrayList<String> rock){
        scan = new Scanner(System.in);
        userChoice = choice;
        rocks = rock;
    }

    public String getUserChoice(){
        return userChoice;
    }
    
    public ArrayList<String> getRocks(){
        return rocks;
    }

    public void addRocks() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back!");

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("Your rock samples have been added.");
        
        System.out.println(rocks);
        System.out.println("\nPlease remove the item that is not a rock.");
        
        rocks.remove("not rock");
        
        System.out.println(rocks);
    }

    public void storingFossils() throws InterruptedException {
        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        userChoice = scan.nextLine();

        if (userChoice.equalsIgnoreCase("Bird")){
            System.out.println("\n" + userChoice + ":\n" + fossils.get("Bird Fossil"));
        }
        else if (userChoice.equalsIgnoreCase("Fish")){
            System.out.println("\n" + userChoice + ":\n" + fossils.get("Fish Fossil"));
        }
        else if (userChoice.equalsIgnoreCase("Tooth")){
            System.out.println("\n" + userChoice + ":\n" + fossils.get("Tooth Fossil"));
        }
        else {
            System.out.println("Error");
        }

    }

    public void itemList() throws InterruptedException {
        Thread.sleep(700);

        HashSet<String> items = new HashSet<String>();
        items.add("Family photo");
        items.add("Wedding ring");
        items.add("Bible");

        System.out.println("\nPersonal items before mission:\n" + items);

        items.remove("Wedding ring");

        System.out.println("\nPersonal items after mission:\n" + items);
    }

    
    
}
