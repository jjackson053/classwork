package homework;

public class Employee {
    private String name;
    private double salary;
    protected  String nickName;


    public String getName(){
      return  name;
    }
    public double getSalary(){
        return  salary;
    }
    public  String getNickName(){
        return nickName;
    }
    public void setName(String name){
        this.name = name;
    }
   public void setSalary(double salary){
        this.salary= salary;
   }
   public void setNickName(String nickName){
        this.nickName= nickName;
   }

    public Employee(String name, double salary, String nickName){
        this.name = name;
        this.salary = salary;
        this.nickName = nickName;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public Employee(String managerTitle) {

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
   public double raiseSalary(double addToSalary){
        double l = addToSalary * 12;
        double x = salary + l;

        return x;
   }
   public String printname(){
      String y =  name;
      String z = nickName;
        return "The employee name is " + y + " and the employee nick name is " + z;
   }
}