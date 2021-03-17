import org.junit.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calculator;

    @Before
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testSqRootInt() {
        double a = 25;
        double expectedRes = 5;
        double res = calculator.sqroot(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testSqRootDouble() {
        double a = 20;
        double expectedRes = 4.472;
        double res = calculator.sqroot(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testFactorial() {
        int a = 5;
        int expectedRes = 120;
        int res = calculator.factorial(a);
        Assert.assertEquals(expectedRes, res);
    }

    @Test
    public void testNaturalLog() {
        double a = 2.718;
        double expectedRes = 1;
        double res = calculator.natural_log(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }

    @Test
    public void testPow() {
        double a = 2;
        double b = 3;
        double expectedRes = 8;
        double res = calculator.pow(a,b);
        Assert.assertEquals(expectedRes, res, 0.001);
    }
}
