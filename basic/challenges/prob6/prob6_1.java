package basic.challenges.prob6;

public class prob6_1 {
    public static void main(String[] args) {
        Minmax minmax = new Minmax();
        int a = 4, b = 2;
        System.out.println("max(" + a + ", " + b + ") = " + minmax.max(a, b));
        System.out.println("min(" + a + ", " + b + ") = " + minmax.min(a, b));
    }
}
