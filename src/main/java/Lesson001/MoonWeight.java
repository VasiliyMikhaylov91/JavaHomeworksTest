package Lesson001;

public class MoonWeight {
    public static double getMoonWeight(double eathWeight) {
        return eathWeight * 0.17;
    }

    public static void main(String[] args) {
        System.out.println(getMoonWeight(100.0));
    }
}
