package virtual_pet;

public class VirtualPet extends VirtualPetShelter {

  String name;
  String description;
  private int hunger;
  private int thirst;
  protected int boredom;
  private boolean isAlive;
  private int batteryLevel;
  private int oilLevel;

  public VirtualPet(String name, String description, int hunger, int thirst, int boredom){
    this.name = name;
    this.boredom = boredom;
    this.hunger = hunger;
    this.thirst = thirst;
    this.description = description;
    //this.boredom = boredom;
    isAlive = true;
  }

  public VirtualPet(String name) {
    super();
  }

  public VirtualPet(String name, String description) {
    this.name = name;
    this.description = description;
  }

//  public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
//
//  }

//  public  void VirtualPetOrganic(String name, String description, int hunger, int thirst, int boredom) {
//    this.name = name;
//    this.description = description;
//    this.hunger = hunger;
//    this.thirst = thirst;
//    this.boredom = boredom;
//    isAlive = true;
//  }

//  public void VirtualPetRobotic(String name, String description, int batteryLevel, int oilLevel, int boredom) {
//    this.name = name;
//    this.description = description;
//    this.batteryLevel = batteryLevel;
//    this.oilLevel = oilLevel;
//    this.boredom = boredom;
//    isAlive = true;
//  }

  public void giveFood() {
    hunger += 15;
    thirst -= 5;
    boredom += 10;
    tick();
  }

  public void giveWater() {
    thirst += 15;
    hunger += 5;
    boredom -= 5;
    tick();
  }

  public void tick() {
    hunger = Math.min(Math.max(hunger - 5, 0), 100);
    thirst = Math.min(Math.max(thirst - 5, 0), 100);
    boredom = Math.min(Math.max(boredom - 5, 0), 100);
  }



  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public int getBatteryLevel() {
    return batteryLevel;
  }

  public int getOilLevel() {
    return oilLevel;
  }

  public int getBoredom(){
    return boredom;
  }

  public Boolean isAlive() {
    return true;
  }
}
