package virtual_pet;

public class VirtualPet extends VirtualPetShelter {

  private String name;
  private String description;
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
    this.boredom = boredom;
    isAlive = true;
  }

  public VirtualPet(String name) {
    super();
  }

//  public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
//
//  }

  public  void VirtualPetOrganic(String name, String description, int hunger, int thirst, int boredom) {
    this.name = name;
    this.description = description;
    this.hunger = hunger;
    this.thirst = thirst;
    this.boredom = boredom;
    isAlive = true;
  }

  public void VirtualPetRobotic(String name, String description, int batteryLevel, int oilLevel, int boredom) {
    this.name = name;
    this.description = description;
    this.batteryLevel = batteryLevel;
    this.oilLevel = oilLevel;
    this.boredom = boredom;
    isAlive = true;
  }

  public void tick() {
    hunger = Math.min(Math.max(hunger - 5, 0), 100);
    thirst = Math.min(Math.max(thirst - 5, 0), 100);
    boredom = Math.min(Math.max(boredom - 5, 0), 100);
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

  public int getBoredom(){
    return boredom;
  }

  public Boolean isAlive() {
    return true;
  }
}
