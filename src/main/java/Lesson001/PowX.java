package Lesson001;

import org.w3c.dom.ls.LSOutput;

public class PowX {
    public static double power(double base, int degree) {
        if (degree < 0) {
            return (1 / base) * power(1 / base, -degree - 1);
        }
        if (degree == 0) {
            return 1;
        }
        if (degree % 2 == 1) {
            return  base * power(base * base, degree / 2);
        }
        return power(base * base, degree / 2);
    }

    public static void main(String[] args) {
        System.out.println(power(0,0));
    }
}
