
public class TestVehicle {

  public static void main(String[] args){
    /* Vehicle vOne = new Vehicle();
    vOne.setColor("green");
    vOne.setNumOfWheels(4);
    vOne.displayMyDetails();
    vOne.runMaxSpeed();
    vOne.myVehicleColor("peach");

    Car cOne = new Car();
    cOne.setColor("Yellow");
    cOne.setNumOfWheels(4);
    cOne.setBrand("celerio");

    cOne.displayMyDetails();
    cOne.runMaxSpeed();
    cOne.myVehicleColor( "black"); */

    Vehicle av = new Car();
    //av.myCarMethod();
    av.displayMyDetails();
    av.runMaxSpeed();

    Car mycar = (Car) av;
    mycar.myCarMethod();

  }
}