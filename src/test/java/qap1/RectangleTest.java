package qap1;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    Rectangle rUnderTest = new Rectangle(9, 5);

    @Test
    public void testGetArea() {
        Assert.assertTrue(rUnderTest.getArea() == 45);
    }

    @Test
    public void testGetPerimeter(){
        Assert.assertTrue(rUnderTest.getPerimeter() == 28);
    }
}
