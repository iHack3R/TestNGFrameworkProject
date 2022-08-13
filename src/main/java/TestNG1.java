import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
    @Test
    public void TestCase1() {
        System.out.println("Hello");
    }
    @Test
    public void TestCase2() {
        System.out.println("World");
        Assert.assertFalse(true);
    }
}