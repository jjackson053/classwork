package homework;

public class Manager extends Employee{
    private String managerTitle;

    public String getManagerTitle(){
        return managerTitle;
    }
    public void setManagerTitle(String managerTitle){
        this.managerTitle =managerTitle;
    }

    public Manager(String name, double salary, String nickName) {
        super(name, salary, nickName);
    }


    public Manager(String name, double salary) {
        super(name, salary);
    }
    public Manager(String managerTitle){
        super(managerTitle);
        this.managerTitle = managerTitle;
    }

}
