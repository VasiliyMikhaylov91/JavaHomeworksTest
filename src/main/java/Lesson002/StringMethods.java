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

    public static void test4(String args[]) {
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

    public static void test5(String args[]) {
        String s = "Я стану программистом!";
        s = s.concat(" Очень хорошим программистом!");

        System.out.println(s);
    }

    public static void test6(String args[]) {
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

    public static void test7(String args[]) {
        char[] Str1 = "привет мир".toCharArray();
        String Str2 = "";

        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Возвращаемая строка: " + Str2);

        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);
    }

    public static void test9(String args[]){
        String Str = new String("Добро пожаловать сюда");
        boolean retVal;

        retVal = Str.endsWith("сюда");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("пожаловать");
        System.out.println("Возвращаемое значение: " + retVal);
    }

    public static void test11(String args[]) {
        String Str1 = "Добро пожаловать";
        String Str2 = Str1;
        String Str3 = new String("Что-то там");
        String Str4 = new String("ДОБРО ПОЖАЛОВАТЬ");
        boolean retVal;

        retVal = Str1.equalsIgnoreCase(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

        retVal = Str1.equalsIgnoreCase(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );

        retVal = Str1.equalsIgnoreCase(Str4);
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal );
    }

    public static void test20(String args[]){
        String Str1 = new String("Добро пожаловать");
        System.out.println("Неканоническое представление Str1: " + Str1);
        String Str2 = new String("Добро пожаловать");
        System.out.println("Неканоническое представление Str2: " + Str2);
        System.out.println(Str1 == Str2);

        System.out.print("Каноническое представление Str1: " );
        System.out.println(Str1.intern());

        System.out.print("Каноническое представление Str2: " );
        System.out.println(Str2.intern());
        System.out.println(Str1.intern() == Str2.intern());
    }

    public static void test25(String args[]) {
        String Str1 = new String("Первая строка");
        String Str2 = new String("Вторая уже строка");

        System.out.print("Длина строки \"Первая строка\" - ");
        System.out.println(Str1.length());

        System.out.print("Длина строки \"Вторая уже строка\" - ");
        System.out.println(Str2.length());
    }

    public static void test37(String args[]){
        String Str = new String("Добро пожаловать");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5, 10));
    }

    public static void test39(String args[]){
        String Str = new String("Добро пожаловать");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toCharArray());
    }

    public static void test45(String args[]){
        String Str = new String("      !Много букавак!       ");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.trim());
    }
}
