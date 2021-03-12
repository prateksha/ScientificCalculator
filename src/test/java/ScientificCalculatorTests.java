import org.junit.*;

public class ScientificCalculatorTests {
    private ScientificCalculator calculator;

    @Before
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testSqRoot() {
        double a = 25;
        double expectedRes = 5;
        double res = calculator.sqroot(a);
        Assert.assertEquals(expectedRes, res, 0.001);
    }
}
