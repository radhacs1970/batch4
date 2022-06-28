class Computer{
  int ram;
  String model;
  String speed;

   {
    System.out.println("instance block");
    ram = 1024;
    model = "hp";
    speed = "1.2ghz";
  } 

  Computer(){
    this.ram=2048;
  }
  Computer(int ram, String model, String speed){
    this.ram = ram;
    this.model = model;
    //this(model, ram); // constructor chaining
    this.speed = speed;  
  }
  Computer( String model,  int ram ){
    this.model = model;
    this.ram  = ram;
  }
  @Override
  public String toString() {
    return "Computer [model=" + model + ", ram=" + ram + ", speed=" + speed + "]";
  }

}

public class ConstructorEx {

  public static void main(String args[]) {
    Computer ct = new Computer();
    System.out.println(  ct.toString() );

    Computer ct2 = new Computer("lenova", 4096);
    System.out.println(ct2);

    Computer ct3 = new Computer(2048,"DELL","1.5GHZ" );
    System.out.println(ct3);

  }
}