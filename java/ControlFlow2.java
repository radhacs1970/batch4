import java.util.Scanner;

public class ControlFlow2 {
  public static void main(String[] args){
    // example of switch
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter between 1-7");
    int val = sc.nextInt();
    sc.nextLine();

    switch(val){
      case 1:
        System.out.println(" Represents Monday");
        break;
      case 2:
        System.out.println(" Represents Tuesday");
        break;
      case 3:
        System.out.println(" Represents Wednesday");
        break;
      case 4:
        System.out.println(" Represents Thursday");
        break;
      case 5:
       System.out.println(" Represents Fridays ");
        
      case 6:
      case 7:
        System.out.println(" Represents Weekend 6, 7");
        break;
      default:
        System.out.println( " Invalid day");
    }

    System.out.println(" Enter color: ");
    String color = sc.nextLine();
    color = color.toLowerCase();
    switch(color){
      case "red":
      System.out.println(" red choosen");
      break;
      case "blue":
      System.out.println(" blue choosen");
      break;
      case "green":
      System.out.println(" green choosen");
      break;
      default:
      System.out.println( " goes to default....");
    }
  }
}