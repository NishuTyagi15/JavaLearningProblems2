public class NewtonMethod {
    public static void main (String[] args) {
        double a = Double.parseDouble(args[0]);

        double epsilon = 1e-15;
        double t = a;

        while (Math.abs(t - a/t) > epsilon * t) {
            t = (a/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
