package DependencyInversion.Example2;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        operation.performOperation();
    }
}
