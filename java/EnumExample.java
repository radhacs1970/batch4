enum Day {
  Sunday , Monday , TuesDay ;
}

public class EnumExample {
  public static void main(String args[]) {
    Day toDay = Day.TuesDay;    

    System.out.println(" to day is " + toDay);
    switch (toDay) {
      case Sunday:
        System.out.println(" Choosen value is sunday ");
        break;
      case Monday:
        System.out.println(" Choosen value is monday ");
        break;
      case TuesDay:
        System.out.println(" Choosen value is tuesday ");
        break;
      default:
        System.out.println(" Other Choosen value is  " + toDay);
        break;
    }

    for( Day d: Day.values() )
      System.out.println(d);

    System.out.println("ordinal" + toDay.ordinal() + 
      "name of enum " + toDay.name());

    // converting from enum data type to string.
    //String myDay = toDay.name();

    // changing the user inputted String to enum data type
    //Day myDay = Day.valueOf("Sunday");
  }
}