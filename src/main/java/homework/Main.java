package homework;

public class Main {
    public static void main(String[] args) {
     Employee boy = new Employee("John", 20000, "lil john");
        System.out.println(boy.raiseSalary(100));
        Manager leadBoy = new Manager("Scrum Master",35000);
        System.out.println(leadBoy.raiseSalary(50));
        leadBoy.setNickName("Scrum master");



    }
}
