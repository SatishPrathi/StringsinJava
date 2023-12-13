public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Call the first add method with two integers
        int result1 = calculator.add(5, 10);
        System.out.println("Result 1: " + result1);

        // Call the second add method with three integers
        int result2 = calculator.add(5, 10, 15);
        System.out.println("Result 2: " + result2);

        // Call the third add method with two doubles
        double result3 = calculator.add(3.5, 2.5);
        System.out.println("Result 3: " + result3);
    }
}
