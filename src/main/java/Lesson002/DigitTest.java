package Lesson002;

public class DigitTest {
    public static boolean checkFullDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkFullDigit("12344"));
    }
}
