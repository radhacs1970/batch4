 enum Desig {
  normal, manager, contract;
}
public class MyEmployee {
  private int empId;
  private Desig desigType;
  private int salary;

  public int getEmpId() {
    return empId;
  }
  public MyEmployee( int empid, Desig desigType){
    this.empId = empid;
    this.desigType = desigType;
  }
  //this is a implict object reference.
  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public Desig getDesigType(){
    return this.desigType;
  }
  public void setDesigType( Desig desigType){
    this.desigType = desigType;
  }
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void processSalary(){
    calcMySalary();
  }
  private void calcMySalary(){

    if ( desigType == Desig.normal )
      salary = 1000;
    else if( desigType == Desig.contract)
      salary = 5000;
    else if ( desigType == Desig.manager)
      salary = 9000;

  }
  public static void main( String args[]){

    MyEmployee mye = new MyEmployee( 1, Desig.contract);
    mye.processSalary();
    System.out.println( mye.getSalary());
  }
}