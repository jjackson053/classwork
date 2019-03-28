package classwork2;

public class Main {
    public static void main(String[] args) {
     Employee taylor = new SalariedEmployee("Taylor", "flexington", 8503, 2000);
        System.out.println(taylor.paycheck());
     Employee charles = new CommissionedEmployee("Charles", "dable", 8505, 200, .5);
        System.out.println(charles.paycheck());
      Employee billy  = new BasePlusEmployee("billy", "johnson",8574,600,.2,10000);
 Employee[] employees= {taylor, charles, billy};
        for(int x = 0; x < employees.length; x++){
            System.out.println(employees[x] + " earned " + employees[x].paycheck());
        }
    }

}
