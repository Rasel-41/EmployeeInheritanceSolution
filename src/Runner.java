public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Rasel");
        employee.setBaseSalary(50000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Base Salary: $" + employee.getBaseSalary());
        System.out.println("Total Salary: $" + employee.getSalary());
        Manager managergr = new Manager();
        managergr.setName("Jane Smith");
        managergr.setBaseSalary(70000);
        managergr.setBonus(15000);
        System.out.println("\nManager Name: " + managergr.getName());
        System.out.println("Base Salary: $" + managergr.getBaseSalary());
        System.out.println("Bonus: $" + managergr.getBonus());
        System.out.println("Total Salary: $" + managergr.getSalary());
    }
}
