public class SimpsonsRule {

    public static double f(double x) {
        // Example function: x^4 - 2x + 1
        return Math.pow(x, 4) - 2 * x + 1;
    }

    public static double simpsonsRule(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(a) + f(b);

        for (int i = 1; i < n; i += 2) {
            sum += 4 * f(a + i * h);
        }

        for (int i = 2; i < n - 1; i += 2) {
            sum += 2 * f(a + i * h);
        }

        return sum * h / 3;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        int n = 6; // Should be even
        double result = simpsonsRule(a, b, n);
        System.out.println("Result of the integral: " + result);
    }
}
