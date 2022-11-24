package Lesson002;

import java.util.Scanner;

public class MultiplyString {
    public static String mulString(String input, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(input);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите строку ");
        String str = sc.nextLine();
        System.out.printf("Сколько раз соединить строку саму с собой?  ");
        int num = sc.nextInt();
        System.out.println(mulString(str, num));
    }
}
