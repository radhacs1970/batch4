import java.util.Objects;
// bean. 
public class Exam {
  private String examName;
  private int maxmark;
  private int dlevel;
  private int passMark;

  public Exam( String examName, int maxmark, int dlevel, int passMark){
    this.examName = examName;
    this.maxmark = maxmark;
    this.dlevel = dlevel;
    this.passMark = passMark;
  }
  @Override
  public int hashCode() {
     int result;
     result = Objects.hash(examName, maxmark, dlevel, passMark);
     return result;
  }
  
  @Override
  public boolean equals(Object obj) {
     boolean retval = false;
     
     if ( obj != null ){
        if (getClass() == obj.getClass()){
          Exam eObj = (Exam) obj;
          if( this.examName.equals(eObj.examName) &&
              this.maxmark == eObj.maxmark &&
              this.dlevel == eObj.dlevel &&
              this.passMark == eObj.passMark  )
              retval = true;
        }       
     }
     return retval;
  }
  @Override
  public String toString() {
     String str;
     str  = " Exam Name : "+ examName + " Max Mark : " + maxmark +
           " Difficulty Level: " + dlevel + " Pass Mark: " + passMark;
     return str;
  }

  public void setExamName(String examName){
    this.examName = examName;
  }
  public String getExamName(){
    return this.examName;
  }
  public void setMaxmark( int maxMark){
    this.maxmark = maxMark;
  }
  public int getMaxmark(){
    return this.maxmark;
  }
  public void setDlevel( int dlevel ){
    this.dlevel = dlevel;
  }
  public int getDlevel(){
    return this.dlevel;
  }
  public void setPassmark( int passMark){
    this.passMark = passMark;
  }
  public int getPassmark(){
    return this.passMark;
  }
}

 