public class NewtonRaphson {

    public static double f(double x) {
        // Example function: x^2 - 4
        return x * x - 4;
    }

    public static double df(double x) {
        // Derivative of the function: 2x
        return 2 * x;
    }

    public static double newtonRaphson(double initialGuess, double tol) {
        double x = initialGuess;
        double h = f(x) / df(x);

        while (Math.abs(h) >= tol) {
            h = f(x) / df(x);
            x = x - h;
        }

        return x;
    }

    public static void main(String[] args) {
        double initialGuess = 1.0;
        double tol = 0.0001;
        double root = newtonRaphson(initialGuess, tol);
        System.out.println("Root found at: " + root);
    }
}
