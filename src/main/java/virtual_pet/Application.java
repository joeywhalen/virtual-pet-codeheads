package virtual_pet;

public class Application {

  public static void main(String[] args) {

    VirtualPetShelter petShelter = new VirtualPetShelter();
    petShelter.initialOrganicPets();
    petShelter.initialRoboticPets();

    System.out.println("Thank you for volunteering at The Codeheads Virtual Pet Shelter!");

    petShelter.displayAllOrganicPetsDescriptions();
    petShelter.displayAllRoboticPetsDescriptions();

  }



}
