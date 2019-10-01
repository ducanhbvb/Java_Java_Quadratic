import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:=");
        double a = sc.nextDouble();
        System.out.println("input b:=");
        double b = sc.nextDouble();
        System.out.println("input c:=");
        double c = sc.nextDouble();
        Quadratic f1 = new Quadratic();
        System.out.println("Quadratic :f(x): ax^2 + bx + c = 0");
        f1.Quadratic(a, b, c);
        if (a != 0) {
            if (f1.getDenta() >= 0) {
                System.out.println("Quadratic in ex1= " + f1.getX1());
                System.out.println("Quadratic in ex1= " + f1.getX2());
            } else {
                System.out.println("The equation has given no solution ");
            }
        } else {
            if (b != 0) {
                System.out.println("Quadratic in ex= " + -c / b);
            } else {
                if (c != 0) {
                    System.out.println("The equation has given no solution");
                } else {
                    System.out.println("The equation has given countless solutions");
                }
            }
        }
    }
}
