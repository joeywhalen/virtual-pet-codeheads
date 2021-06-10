package virtual_pet;

public class RoboticPet extends VirtualPet {

  protected int batteryLevel;
  protected int oilLevel;


  public RoboticPet(String name, String description, int batteryLevel, int oilLevel, int boredom) {
    super(name, description);
    this.batteryLevel = batteryLevel;
    this.oilLevel = oilLevel;
    this.boredom = boredom;
    //isAlive = true;
  }

//Add batterylevel and oillevel to constructor
  public RoboticPet (String name) {
    super(name);
    this.batteryLevel = batteryLevel;
    this.oilLevel = oilLevel;

  }

  //Should def go in robotic class!
  public void roboticTick() {
    oilLevel = Math.min(Math.max(oilLevel - 5, 0), 100);
    batteryLevel = Math.min(Math.max(batteryLevel - 5, 0), 100);
    boredom = Math.min(Math.max(boredom - 5, 0), 100);
  }



  public int getBatteryLevel() {
    return batteryLevel;
  }

  public int getOilLevel() {
    return oilLevel;
  }

}
