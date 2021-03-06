package virtual_pet;

public class VirtualPet extends VirtualPetShelter {

  String name;
  String description;
  private int hunger;
  private int thirst;
  protected int boredom;
  protected int waste;
  private boolean isAlive;
  private int batteryLevel;
  private int oilLevel;

  public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int waste){
    this.name = name;
    this.description = description;
    this.boredom = boredom;
    this.hunger = hunger;
    this.thirst = thirst;
    this.waste = waste;
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
    waste -= 10;
    tick();
  }

  public void giveWater() {
    thirst += 15;
    hunger += 5;
    boredom -= 5;
    waste -= 10;
    tick();
  }

  public void playWithOrganic(String name) {
    boredom += 15;
    hunger -= 10;
    thirst -= 5;
    tick();
  }

  public void walkOrganic(String name) {
    hunger -= 10;
    thirst -= 5;
    boredom += 15;
    waste += 25;
    tick();
  }

  public void cleanCages() {
    hunger -= 5;
    thirst -= 5;
    boredom -= 5;
    waste = 100;
    tick();
  }

  public void chargeBattery() {
    batteryLevel = 100;
    oilLevel -= 5;
    boredom -= 10;
    roboticTick();
  }

  public void oilRobotic() {
    batteryLevel -= 10;
    oilLevel = 100;
    boredom -= 10;
    roboticTick();
  }

  public void playWithRobotic(String name) {
    batteryLevel -= 10;
    oilLevel -= 10;
    boredom += 15;
    roboticTick();
  }

  public void walkRobotic(String name) {
    batteryLevel -= 20;
    oilLevel -= 20;
    boredom += 20;
    roboticTick();
  }

  public void tick() {
    hunger = Math.min(Math.max(hunger - 5, 0), 100);
    thirst = Math.min(Math.max(thirst - 5, 0), 100);
    boredom = Math.min(Math.max(boredom - 5, 0), 100);
    waste = Math.min(Math.max(boredom - 5, 0), 100);
  }

  public void roboticTick() {
    oilLevel = Math.min(Math.max(oilLevel - 5, 0), 100);
    batteryLevel = Math.min(Math.max(batteryLevel - 5, 0), 100);
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

  public int getWaste() { return waste;}

  public Boolean isAlive() {
    return true;
  }
}
