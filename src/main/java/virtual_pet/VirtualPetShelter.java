package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

  int adoptPet;
  boolean isAlive = true;

  ArrayList<VirtualPet> virtualOrganicPets = new ArrayList<VirtualPet>(); //ArrayList<VirtualPetOrganic> virtualOrganicPets = new ArrayList<VirtualPetOrganic>();
  ArrayList<VirtualPet> virtualRoboticPets = new ArrayList<VirtualPet>();
  Scanner userInput = new Scanner(System.in);

  String heading1 = "Name";
  String heading2 = "|Hunger";
  String heading3 = "|Thirst";
  String heading4 = "|Boredom";
  String divider = "---------|-------|-------|-------";

  String heading5 = "Name";
  String heading6 = "|Battery";
  String heading7 = "|Oil";
  String heading8 = "|Boredom";
  String divider2 = "---------|-------|-------|-------";


  public void initialOrganicPets() {
    VirtualPet yogi = new VirtualPet("Yogi", "Not your av-er-age bear.", 50, 50, 50);
    VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
    VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
    VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
    VirtualPet ticktock = new VirtualPet("Tick-Tock", "I swallowed a clock.  So what?", 40, 50, 60);
    VirtualPet wally = new VirtualPet("WallyGator", "Yea, I'm prone to mishaps.  So what?", 50, 60, 70);
    virtualOrganicPets.add(yogi);
    virtualOrganicPets.add(smokey);
    virtualOrganicPets.add(winnie);
    virtualOrganicPets.add(gummi);
    virtualOrganicPets.add(ticktock);
    virtualOrganicPets.add(wally);
  }

  public void initialRoboticPets() {
    RoboticPet booboo = new RoboticPet("Boo-Boo", "But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 40);
    RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 30, 30, 30);
    RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name.  So what?", 35, 70, 40);
    RoboticPet gummy = new RoboticPet("Gummy", "Yea, I'm a Brony.  So what?", 35, 70, 20);
    RoboticPet benali = new RoboticPet("Ben Ali", "I'm a prince.  So what?", 50, 60, 70);
    RoboticPet gabby = new RoboticPet("Gabby", "Yea, I hate Woody Woodpecker.  So what?", 40, 60, 80);
    virtualRoboticPets.add(booboo);
    virtualRoboticPets.add(kissyfur);
    virtualRoboticPets.add(ally);
    virtualRoboticPets.add(gummy);
    virtualRoboticPets.add(benali);
    virtualRoboticPets.add(gabby);
  }

  public void displayAllOrganicPetsDescriptions() {
    for (VirtualPet virtualOrganicPet : virtualOrganicPets) {
      System.out.println("[" + virtualOrganicPet.getName() + "]" + " " + virtualOrganicPet.getDescription());
      System.out.println("");
    }
  }

  public void displayAllRoboticPetsDescriptions() {
    for (VirtualPet virtualRoboticPet : virtualRoboticPets) {
      System.out.println("[" + virtualRoboticPet.getName() + "]" + " " + virtualRoboticPet.getDescription());
      System.out.println("");
    }
  }

  public void checkOrganicHealthStatus() {
    for (int i = 0; i < virtualOrganicPets.size(); i++) {
      if ((virtualOrganicPets.get(i).getHunger() <= 0 || virtualOrganicPets.get(i).getThirst() <= 0 || virtualOrganicPets.get(i).getBoredom() <= 0)) {
        isAlive = false;
        System.out.println("");
        System.out.println("You've neglected one of the pets!  We've been shut down!");
        System.out.println("");
        virtualOrganicPets.clear();
        virtualRoboticPets.clear();
        displayOrganicHealthStatus();
        System.exit(0);
      }
    }
  }

  public void displayOrganicHealthStatus() {
    System.out.printf("%-8s %-7s %-7s %-7s %n", heading1, heading2, heading3, heading4);
    System.out.println(divider);
    for (int i = 0; i < virtualOrganicPets.size(); i++) {
      System.out.printf("%-10s %-7s %-7s %-7s %n", virtualOrganicPets.get(i).getName(),
              virtualOrganicPets.get(i).getHunger(), virtualOrganicPets.get(i).getThirst(),
              virtualOrganicPets.get(i).getBoredom());
    }
  }

  public void checkRoboticHealthStatus() {
    for (int i = 0; i < virtualRoboticPets.size(); i++) {
      if ((virtualRoboticPets.get(i).getBatteryLevel() <= 0 || virtualRoboticPets.get(i).getOilLevel() <= 0 || virtualRoboticPets.get(i).getBoredom() <= 0)) {
        isAlive = false;
        System.out.println("");
        System.out.println("You've neglected one of the pets!  We've been shut down!");
        System.out.println("");
        virtualOrganicPets.clear();
        virtualRoboticPets.clear();
        displayRoboticHealthStatus();
        System.exit(0);
      }
    }
  }

  public void displayRoboticHealthStatus() {
    System.out.printf("%-8s %-7s %-7s %-6s %n", heading5, heading6, heading7, heading8);
    System.out.println(divider2);
    for (int i = 0; i < virtualRoboticPets.size(); i++) {
      System.out.printf("%-10s %-7s %-7s %-7s %n", virtualRoboticPets.get(i).getName(),
              virtualRoboticPets.get(i).getBatteryLevel(), virtualRoboticPets.get(i).getOilLevel(),
              virtualRoboticPets.get(i).getBoredom());
    }
  }

  public void addOrganicPetToShelter() {
    System.out.println("Please enter the organic pet's name");
    Scanner addName = new Scanner(System.in);
    String name = (addName.nextLine());

    System.out.println("Please Enter the organic pet's Description");
    Scanner addDescription = new Scanner(System.in);
    String description = (addDescription.nextLine());

    System.out.println("Please enter the organic pet's Hunger.");
    Scanner addHunger = new Scanner(System.in);
    int hunger = (addHunger.nextInt());

    System.out.println("Please enter the organic pet's Thirst.");
    Scanner addThirst = new Scanner(System.in);
    int thirst = (addThirst.nextInt());

    System.out.println("Please enter the organic pet's Boredom.");
    Scanner addBoredom = new Scanner(System.in);
    int boredom = (addBoredom.nextInt());

    VirtualPet newOrganicPet = new VirtualPet(name, description, hunger, thirst, boredom);
    virtualOrganicPets.add(newOrganicPet);
  }

  public void addRoboticPetToShelter() {
    System.out.println("Please enter the robotic pet's name");
    Scanner addName = new Scanner(System.in);
    String name = (addName.nextLine());

    System.out.println("Please Enter the robotic pet's Description");
    Scanner addDescription = new Scanner(System.in);
    String description = (addDescription.nextLine());

    System.out.println("Please enter the robotic pet's Battery Level.");
    Scanner addBatteryLevel = new Scanner(System.in);
    int batteryLevel = (addBatteryLevel.nextInt());

    System.out.println("Please enter the robotic pet's Oil Level.");
    Scanner addOilLevel = new Scanner(System.in);
    int oilLevel = (addOilLevel.nextInt());

    System.out.println("Please enter the robotic pet's Boredom.");
    Scanner addBoredom = new Scanner(System.in);
    int boredom = (addBoredom.nextInt());

    RoboticPet newRoboticPet = new RoboticPet(name, description, batteryLevel, oilLevel, boredom);
    virtualRoboticPets.add(newRoboticPet);
  }

  public void removeOrganicPetFromShelter(String adoptName) {
    virtualOrganicPets.removeIf(pet -> pet.getName().equalsIgnoreCase(adoptName));
  }

  public void removeRoboticPetFromShelter(String adoptName) {
    virtualRoboticPets.removeIf(pet -> pet.getName().equalsIgnoreCase(adoptName));
  }

  public void feedAll() {
    for (VirtualPet pet : virtualOrganicPets) {
      pet.giveFood();
      pet.tick();
    }
  }

  public void waterAll() {
    for (VirtualPet pet : virtualOrganicPets) {
      pet.giveWater();
      pet.tick();
    }
  }

  public void playWithOrganic(String name) {
    for (VirtualPet pet : virtualOrganicPets) {
      if (pet.getName().equalsIgnoreCase(name)) {
        pet.playWithOrganic(name);
      } else {
        pet.tick();
      }
    }
  }

  public void chargeAll() {
    for (VirtualPet pet : virtualRoboticPets) {
      pet.chargeBattery();
      pet.tick();
    }
  }

  public void oilAll() {
    for (VirtualPet pet : virtualRoboticPets) {
      pet.oilRobotic();
      pet.tick();
    }
  }

  public void playWithRobotic(String name) {
    for (VirtualPet pet : virtualRoboticPets) {
      if (pet.getName().equalsIgnoreCase(name)) {
        pet.playWithRobotic(name);
      } else {
        pet.roboticTick();
      }
    }
  }

  public void walkRobotic(String name) {
    for (VirtualPet pet : virtualRoboticPets) {
      if (pet.getName().equalsIgnoreCase(name)) {
        pet.walkRobotic(name);
      } else {
        pet.roboticTick();
      }
    }
  }

  public void tick() {
    for (VirtualPet pet : virtualOrganicPets) {
      pet.tick();
    }
  }

  public Boolean isAlive() {
    return true;
  }

}
