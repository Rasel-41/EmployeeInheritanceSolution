public class Manager extends Employee{
    private double bonus;
    Manager( ){
       super();
       this.bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }
}
