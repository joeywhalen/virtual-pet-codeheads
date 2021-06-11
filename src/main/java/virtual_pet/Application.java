package virtual_pet;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    VirtualPetShelter petShelter = new VirtualPetShelter();
    petShelter.initialOrganicPets();
    petShelter.initialRoboticPets();
    Scanner userInput = new Scanner(System.in);

    System.out.println("Thank you for volunteering at The Codeheads Virtual Pet Shelter!");

//    petShelter.displayAllOrganicPetsDescriptions();
//    petShelter.displayAllRoboticPetsDescriptions();
//    petShelter.checkOrganicHealthStatus();
//    petShelter.displayOrganicHealthStatus();
//    System.out.println(" ");
//    petShelter.checkRoboticHealthStatus();
//    petShelter.displayRoboticHealthStatus();
//    System.out.println(" ");
//    petShelter.addOrganicPetToShelter();
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    System.out.println(" ");
//    petShelter.displayOrganicHealthStatus();
//    System.out.println(" ");
//    petShelter.addRoboticPetToShelter();
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    System.out.println(" ");
//    petShelter.displayRoboticHealthStatus();
//    System.out.println("Okay, please choose an organic pet to adopt. ");
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which organic pet have you chosen? ");
//    String adoptName = userInput.nextLine();
//    petShelter.removeOrganicPetFromShelter(adoptName);
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    petShelter.displayOrganicHealthStatus();

//    System.out.println("Okay, please choose a robotic pet to adopt. ");
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which robotic pet have you chosen? ");
//    String adoptName = userInput.nextLine();
//    petShelter.removeRoboticPetFromShelter(adoptName);
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    petShelter.displayRoboticHealthStatus();

//    petShelter.displayOrganicHealthStatus();
//    petShelter.feedAll();
//    System.out.println(" ");
//    petShelter.displayOrganicHealthStatus();
//
//    petShelter.displayOrganicHealthStatus();
//    petShelter.waterAll();
//    System.out.println(" ");
//    petShelter.displayOrganicHealthStatus();
//
//    petShelter.displayOrganicHealthStatus();
//    System.out.println("Okay, please choose an Organic pet to play with.");
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which pet have you chosen? ");
//    String name = userInput.nextLine();
//    petShelter.playWithOrganic(name);
//    System.out.println(" ");
//    petShelter.displayOrganicHealthStatus();
//    petShelter.checkOrganicHealthStatus();

//    petShelter.displayRoboticHealthStatus();
//    System.out.println("Okay, please choose a robotic pet to play with.");
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which pet have you chosen? ");
//    String playName = userInput.nextLine();
//    petShelter.playWithRobotic(playName);
//    System.out.println(" ");
//    petShelter.displayRoboticHealthStatus();
//    petShelter.checkRoboticHealthStatus();

//    petShelter.displayRoboticHealthStatus();
//    petShelter.chargeAll();
//    System.out.println(" ");
//    petShelter.displayRoboticHealthStatus();

//    petShelter.displayRoboticHealthStatus();
//    petShelter.oilAll();
//    System.out.println(" ");
//    petShelter.displayRoboticHealthStatus();

    petShelter.displayRoboticHealthStatus();
    System.out.println("Okay, please choose a robotic pet to walk.");
    System.out.println(" ");
    petShelter.displayAllRoboticPetsDescriptions();
    System.out.println(" ");
    System.out.println("Which pet have you chosen? ");
    String walkName = userInput.nextLine();
    petShelter.walkRobotic(walkName);
    System.out.println(" ");
    petShelter.displayRoboticHealthStatus();
    petShelter.checkRoboticHealthStatus();

  }



}
