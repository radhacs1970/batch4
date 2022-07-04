import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateEx {
  static Scanner sc = new Scanner( System.in);
  public static void main( String[] args){

    LocalDate curDate = LocalDate.now();
    System.out.println( curDate );
    DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM/dd/YYYY");
    String st = curDate.format(dt); // format the current date to return string
    System.out.println( st );

    // how to get the date from console and convert to local date.
    System.out.println(" Enter the BirthDay (dd/MM/yyyy):");
    String myDate = sc.nextLine();
    DateTimeFormatter dtBirthday = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate ldBirth = LocalDate.parse(myDate,dtBirthday);
    System.out.println( " Birthday  is : " + ldBirth.format(dt) );
    System.out.println(" Next day of my birthday is " + ldBirth.plusDays(1).format(dt));
    

    Period period = Period.between(ldBirth, curDate);
    System.out.print(period.getYears() + " years,");
    System.out.print(period.getMonths() + " months,");
    System.out.print(period.getDays() + " days");
    System.out.println();
    
  }

}