public class TrapezoidalRule {

    public static double f(double x) {
        // Example function: x^3 - x^2 + 2
        return Math.pow(x, 3) - Math.pow(x, 2) + 2;
    }

    public static double trapezoidalRule(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            sum += 2 * f(a + i * h);
        }

        return (h / 2) * sum;
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        int n = 6;
        double result = trapezoidalRule(a, b, n);
        System.out.println("Result of the integral: " + result);
    }
}
