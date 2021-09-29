package qap1;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    Circle circleUnderTest = new Circle(2);

    @Test
    public void testGetArea() {
        Assert.assertTrue(circleUnderTest.getArea() == 2 * 2 * 3.14);
    }
}
