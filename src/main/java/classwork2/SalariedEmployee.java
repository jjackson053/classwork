package classwork2;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String LastName, double employeeID, double weeklySalary){
        super(firstName, LastName, employeeID);
        this.weeklySalary= weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee";
    }
    @Override
    public String paycheck(){
        String x =" ";
        x+= weeklySalary;
        return x;
    }

}
