interface Sports{
  void sportsname();
}
public interface Match extends Sports {
  void play();

  // in java 8
  default void listPlayersJ8( String[] pls){
    System.out.println(" default implementation " + pls);
  }
}