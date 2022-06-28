
public class TestAnimal {
  public static void main( String[] args){

    Lion ln = new Lion();
    ln.canSwim();
    ln.liveintrees();
    ln.eat();
    ln.seeInNight();

    //ln.animalGeneral();
    Animal.animalGeneral();
    ln.animaltheme();
    System.out.println( "static final " + Animal.maxcount + 
      " final var " + ln.forest + 
      " static var " + Animal.dealswith );
  }

}