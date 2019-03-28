package classwork2;

public class BasePlusEmployee extends CommissionedEmployee {
    private double baseSalary;

    public BasePlusEmployee(String firstName, String LastName, double employeeID,double grossSale, double commisionRate, double baseSalary){
        super(firstName,LastName,employeeID,grossSale,commisionRate);
        this.baseSalary= baseSalary;

    }

    @Override
    public String toString() {
        return "BasePlusEmployee";
    }

    @Override
   public String paycheck(){
        String p = "";
        double q = getCommisionRate() * getGrossSales();
        double o = baseSalary + q;
        p+=o;
        return p;
   }
}
