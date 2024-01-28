public class BisectionMethod {

    public static double f(double x) {
        // Example function: x^3 - x - 2
        return x * x * x - x - 2;
    }

    public static double bisectionMethod(double a, double b, double tol) {
        if (f(a) * f(b) >= 0) {
            System.out.println("Incorrect initial interval [a,b]");
            return Double.NaN;
        }

        double c = a;
        while ((b - a) / 2 > tol) {
            c = (a + b) / 2;
            if (f(c) == 0.0)
                break;
            else if (f(c) * f(a) < 0)
                b = c;
            else
                a = c;
        }
        return c;
    }

    public static void main(String[] args) {
        double a = 1, b = 2, tol = 0.001;
        double root = bisectionMethod(a, b, tol);
        System.out.println("Root found at: " + root);
    }
}
