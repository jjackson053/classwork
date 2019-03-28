package classwork2;

public class Employee {
    private String firstName;
    private  String LastName;
    private  double employeeID;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return  LastName;
    }
    public double getEmployeeID(){
        return  employeeID;
    }

    public Employee(String firstName, String LastName, double employeeID){
        this.firstName = firstName;
        this.LastName = LastName;
        this.employeeID = employeeID;
    }
    String paycheck(){
        return "you got paid";
    }
}
