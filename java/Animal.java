
public abstract class Animal {
  String color;
  int legs;
  final String forest="Amazon";// in each instance this final variable will be created.
  static String dealswith ="deals with some theme";
  static final int maxcount = 99; // it is created at class level and cnnot be changed.

  public void eat(){
    System.out.println(" Animals eating");
  }
  public abstract boolean canSwim();
  public void seeInNight(){
    System.out.println(" Can very well see in night ");
  }
  public static void animalGeneral(){
    System.out.println("This class contains general description of animal");
  }
  public final void animaltheme(){
    System.out.println("This animal theme is for chirstmas holidays.");
  }
  public static final void stfin(){
    System.out.println("stfn");
  }

}