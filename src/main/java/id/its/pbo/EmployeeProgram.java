package id.its.pbo;

public class EmployeeProgram {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Doe", 6000);

        System.out.println("Yearly salary of " + employee1.getFirstName() + " " + employee1.getLastName() + ": " + employee1.getYearlySalary());
        System.out.println("Yearly salary of " + employee2.getFirstName() + " " + employee2.getLastName() + ": " + employee2.getYearlySalary());

        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.println("Yearly salary of " + employee1.getFirstName() + " " + employee1.getLastName() + " after 10% raise: " + employee1.getYearlySalary());
        System.out.println("Yearly salary of " + employee2.getFirstName() + " " + employee2.getLastName() + " after 10% raise: " + employee2.getYearlySalary());
    }
}

