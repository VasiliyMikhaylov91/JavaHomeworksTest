package Lesson002;

public class StringMethods {
    public static void test1(String args[]) {
        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);
    }

    public static void test2(String args[]) {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
    }

    public static void test3(String args[]) {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я Буду Хорошим Программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }

    public static void test4(String args[]) {
        String s = "Я стану программистом!";
        s = s.concat(" Очень хорошим программистом!");

        System.out.println(s);
    }

    public static void test5(String args[]) {
        String str1 = "Добро пожаловать";
        String str2 = "Сайт для изучения программирования";
        StringBuffer str3 = new StringBuffer("Добро пожаловать");
        StringBuffer str4 = new StringBuffer("Добро пожаловать туда");

        boolean  result = str1.contentEquals(str3);
        System.out.println("Строка \"Добро пожаловать\" равна строке буфера \"Добро пожаловать\"? \n" + result);

        result = str2.contentEquals(str3);
        System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать\"? \n" + result);

        result = str1.contentEquals(str4);
        System.out.println("Строка \"Добро пожаловать\" равна строке буфера \"Добро пожаловать туда\"? \n" + result);
    }

    public static void test6(String args[]) {
        String Str1 = "привет мир";
        char[] arrChar = new char[Str1.length()];
        for (int i = 0; i < Str1.length(); i++) {
            arrChar[i] = Str1.charAt(i);
        }
        String Str2 = "";

        Str2 = Str2.copyValueOf(arrChar);
        System.out.println("Возвращаемая строка: " + Str2);

        Str2 = Str2.copyValueOf(arrChar, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);
    }

    
}
