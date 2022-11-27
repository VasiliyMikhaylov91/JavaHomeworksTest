package Lesson004;


public class Balls {
    public static void main(String[] args) {
        String input = "513332";
        int sum = 0;
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) sum += count;
                count = 1;
            }
        }
        if (count >= 3) sum += count;
        System.out.println(sum);
    }
}
