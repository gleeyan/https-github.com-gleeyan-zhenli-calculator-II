public class CalculatorTest {
	public static void main (String[] args) {
		Calculator test1 = new Calculator();
		test1.performOperation(5.5);
		test1.performOperation(6);
		test1.performOperation(6);
		test1.performOperation(8.);
		test1.performOperation(2.5);
		test1.performOperation("-");
		test1.performOperation("/");
		test1.performOperation("+");
		test1.performOperation("*");
		test1.performOperation("=");
		System.out.println(test1.evaluate()*2);
	}
}
