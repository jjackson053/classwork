package classwork2;

public class CommissionedEmployee extends Employee {
    private double grossSales;
    private double commisionRate;

    public double getGrossSales(){
        return grossSales;
    }
    public double getCommisionRate(){
        return commisionRate;
    }
    public void setGrossSales(){
        this.grossSales = grossSales;
    }
    public void setCommisionRate(){
        this.commisionRate = commisionRate;
    }

    public CommissionedEmployee(String firstname, String LastName, double employeeID, double grossSales, double commisionRate){
        super(firstname, LastName , employeeID);
        this.commisionRate= commisionRate;
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "CommissionedEmployee";}

    @Override
    public String paycheck(){
        String g = "";
        double e = commisionRate * grossSales;
        g+=e;
        return g;
    }
}
