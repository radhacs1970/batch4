import java.util.Objects;

public class Vehicle {
  private int numOfWheels;
  private String color;
  private int gear = 4;

  public final int getGear(){
    return  gear;
  }

  public int getNumOfWheels() {
    return numOfWheels;
  }
  public void setNumOfWheels(int numOfWheels) {
    this.numOfWheels = numOfWheels;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  // can run in certain speed
  public void runMaxSpeed(){
    System.out.println( " Max speed of general vehicle 50 " );
  }

  protected String myVehicleColor(String color ){
    System.out.println( " Default color of my vehicle is  " + color );
    this.color = color;
    return this.color;
  }
  public void displayMyDetails(){
    System.out.println( " Vehicle has " + getNumOfWheels() + 
      " Wheels "+
      " with color as " + getColor() + 
      " gears are : " + this.gear) ;
  }
}
