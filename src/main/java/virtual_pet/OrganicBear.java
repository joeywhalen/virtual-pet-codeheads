package virtual_pet;

public class OrganicBear extends OrganicPet implements Walkable {

  public OrganicBear (String name) {
    super(name);
  }

  @Override
  public void walk() {boredom -= 5;}

}
