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

  public void chargeBattery() {
    batteryLevel = 100;
    oilLevel -= 5;
    boredom -= 10;
    tick();
  }

  public void oilRobotic() {
    batteryLevel -= 10;
    oilLevel = 100;
    boredom -= 10;
    tick();
  }

  public void playWithRobotic(String name) {
    batteryLevel -= 20;
    oilLevel -= 20;
    boredom += 20;
    tick();
  }

  public void walkRobotic(String name) {
    batteryLevel -= 20;
    oilLevel -= 20;
    boredom += 20;
    tick();
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
