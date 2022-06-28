
public  class Wild extends Animal {

  @Override
  public boolean canSwim() {
    System.out.println(" Wild animals cannot swim...");
    return false;
  }
  public  void liveintrees(){
    System.out.println(" some animals live in trees");
  }
  public final void livesInForest(){
    System.out.println( "Wild animal lives in forest");
  }
}