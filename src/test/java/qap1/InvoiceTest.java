package qap1;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {
    Invoice invoiceUnderTest = new Invoice("abc123", "Designer Water Heater", 2, 500);

    @Test
    public void testGetTotal() {
        Assert.assertTrue(invoiceUnderTest.getTotal() == 1000);
    }
}
