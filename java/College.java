
public class College implements Event, Match{

  @Override
  public void speaking() {
    System.out.println("Speaking on New technologies");
  }

  @Override
  public void musicEvent(String mydate, int participants) {
      System.out.println(" Music event on " + mydate + 
        " with " + participants + " joining " );
         
  }

  public void examOntech(){
    System.out.println(" Exam on Technologies");
  }

  @Override
  public void sportsname() {
    // TODO Auto-generated method stub
    System.out.println(" MY SRM CLUB SPORTS");
  }

  @Override
  public void play() {
    // TODO Auto-generated method stub
    System.out.println("Basketball play");
  }

  /* 
  // in java 8
   public void listPlayersJ8( String[] pls){
    System.out.println(" College implementation " + pls.length);
  } 
  */
}