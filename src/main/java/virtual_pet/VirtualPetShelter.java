package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

  int adoptPet;
  boolean isAlive = true;

  ArrayList<VirtualPet> virtualOrganicPets = new ArrayList<VirtualPet>();
  ArrayList<VirtualPet> virtualRoboticPets = new ArrayList<VirtualPet>();
  //Scanner userInput =

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
    VirtualPet wally = new VirtualPet("Wally Gator", "Yea, I'm prone to mishaps.  So what?", 50, 60, 70);
    virtualOrganicPets.add(yogi);
    virtualOrganicPets.add(smokey);
    virtualOrganicPets.add(winnie);
    virtualOrganicPets.add(gummi);
    virtualOrganicPets.add(ticktock);
    virtualOrganicPets.add(wally);
  }

  public void initialRoboticPets() {
    VirtualPet booboo = new VirtualPet("Boo-Boo", "But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 40);
    VirtualPet kissyfur = new VirtualPet("Kissyfur", "I used to be a circus bear.", 30, 30, 30);
    VirtualPet ally = new VirtualPet("Ally Gator", "It's a punny name.  So what?", 35, 70, 40);
    VirtualPet gummy = new VirtualPet("Gummy", "Yea, I'm a Brony.  So what?", 35, 70, 20);
    VirtualPet benali = new VirtualPet("Ben Ali", "I'm a prince.  So what?", 50, 60, 70);
    VirtualPet gabby = new VirtualPet("Gabby", "Yea, I hate Woody Woodpecker.  So what?", 40, 60, 80);
    virtualRoboticPets.add(booboo);
    virtualRoboticPets.add(kissyfur);
    virtualRoboticPets.add(ally);
    virtualRoboticPets.add(gummy);
    virtualRoboticPets.add(benali);
    virtualRoboticPets.add(gabby);
  }

}
