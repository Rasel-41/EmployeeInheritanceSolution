public class Employee {
    private String name;
    private double baseSalary;
    public Employee(){
        this.name = " ";
        this.baseSalary = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public double getSalary(){
        return baseSalary;
    }
}
