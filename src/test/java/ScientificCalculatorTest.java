import org.junit.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calculator;

    @Before
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testSqRootIntTP() {
        double a = 25;
        double expectedRes = 5;
        double res = calculator.sqroot(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testSqRootIntTN() {
        double a = 36;
        double expectedRes = 5;
        double res = calculator.sqroot(a);
        Assert.assertNotEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testSqRootDoubleTP() {
        double a = 20;
        double expectedRes = 4.472;
        double res = calculator.sqroot(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testFactorialTP() {
        int a = 5;
        int expectedRes = 120;
        int res = calculator.factorial(a);
        Assert.assertEquals(expectedRes, res);
    }

    @Test
    public void testFactorialTN() {
        int a = 8;
        int expectedRes = 720;
        int res = calculator.factorial(a);
        Assert.assertNotEquals(expectedRes, res);
    }

    @Test
    public void testNaturalLogTP() {
        double a = 2.718;
        double expectedRes = 1;
        double res = calculator.natural_log(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testNaturalLogTN() {
        double a = 2.718;
        double expectedRes = 3;
        double res = calculator.natural_log(a);
        Assert.assertNotEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testPowTP() {
        double a = 2;
        double b = 3;
        double expectedRes = 8;
        double res = calculator.pow(a,b);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testPowTN() {
        double a = 2;
        double b = 4;
        double expectedRes = 8;
        double res = calculator.pow(a,b);
        Assert.assertNotEquals(expectedRes, res, 0.001);
    }
}
