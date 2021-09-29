package qap1;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private float salary;

    public Employee(int id, String firstName, String lastName, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getAnnualSalary() {
        float annualSalary = salary * 12;
        return annualSalary;
    }

    public float raiseSalary(float percent) {
        float rate = 1 + (percent / 100);
        this.salary = salary * rate;
        return salary;
    }

    public String toString() {
        return "qap1.Employee[id=" + id + " firstName=" + firstName + " lastName=" + lastName + " salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

