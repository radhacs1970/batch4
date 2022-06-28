
public class Car extends Vehicle{
  private String brand;

  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
   @Override
   public void runMaxSpeed() {
    System.out.println(" car Maximum speed - is 200");
   }

   @Override
   public String myVehicleColor(String color) {
      String mycolor = color;
    System.out.println(" car color is modified to " + mycolor);
     return mycolor;
   }

   @Override
   public void displayMyDetails() {
      super.displayMyDetails();
      System.out.println(" Car brand " + brand);
   }
   /* public int getGear(){
     return 5;
   } */

   public void myCarMethod(){
     System.out.println("myCarMethod");
   }
}