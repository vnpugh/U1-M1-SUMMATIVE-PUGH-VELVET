import java.util.Scanner;

public class SomeMath {
    public static void main(String[] args) {

        //call overload methods
        int total5 = add(1, 2, 3, 4, 5);
        System.out.println(total5);

        double average5 = avg(1, 3, 5, 7, 9);
        System.out.println(average5);

        double largest5 = max(42.0, 35.1, 2.3, 40.2, 15.6);
        System.out.println(largest5);
    }

    static int add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    static double avg(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }

    static double max(double a, double b, double c, double d, double e) {
        if (a > b && a > c) return a;
        else if (d > e && d > a) return d;
        else if (b > d && b > a) return b;
        else if (c > a && c > b) return c;
        else return e;
    }
}




