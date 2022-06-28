public class TestInterface{

  public static void main( String[] args ){
    College cl = new College();
    cl.speaking();
    cl.musicEvent("10th July", 20);
    cl.sportsname();
    cl.play();
    cl.examOntech();


    Event ev = new College();
    ev.musicEvent("09th July 2022 ", 10);
    ev.speaking();

    Match mv = (Match)ev;
    mv.sportsname();
    mv.play();
         
    College cg = (College) ev;
    cg.examOntech();

    String[] str = new String[]{"arvind", "jay","ganesh"};
    cg.listPlayersJ8(str);

    System.out.println("Maximum event " + Event.maxEvent);


  }
}