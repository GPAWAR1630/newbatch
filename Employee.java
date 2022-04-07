class Employee
{
 private int id;
 private String name;
  private int salrry;


public static void main(String[] args){

Employee employee=new Employee();
employee.setId(1);
employee.setName("Govind");
employee.setSalrry(55090);
employee.printData();



}


public void setId(int employeeId){
id=employeeId;
}
public int getId(){

return id;

}

public void setName(String employeeName){
name=employeeName;

}
public String getName(){
return name;
}
public void setSalrry(int employeeSalary){
 salary=employeesalary;
}
public int  getSalrry(){
return salary;
}
   public void printData(){
    system.out.println(id+"" +name+"" +salary);


}
}