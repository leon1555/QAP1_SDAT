package qap1;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    Employee employeeUnderTest1 = new Employee(1, "John", "Tzaczyk", 4500);
    Employee employeeUnderTest2 = new Employee(2, "James", "Tuckamore", 5000);

    @Test
    public void testGetAnnualSalary() {
        Assert.assertTrue(employeeUnderTest1.getAnnualSalary() == (4500 * 12));
        Assert.assertTrue(employeeUnderTest2.getAnnualSalary() == (5000 * 12));
    }

    @Test
    public void testRaiseSalary() {
        Assert.assertTrue(employeeUnderTest1.raiseSalary(20) == (4500 * 1.2));
        Assert.assertTrue(employeeUnderTest2.raiseSalary(20) == (5000 * 1.2));
    }
}
