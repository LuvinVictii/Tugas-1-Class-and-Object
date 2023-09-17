package id.its.pbo;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public void raiseSalary(int percentage) {
        if (percentage > 0) {
            this.monthlySalary += this.monthlySalary * (percentage / 100.0);
        }
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12;
    }
}
