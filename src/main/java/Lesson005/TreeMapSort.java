package Lesson005;

import java.util.*;

public class TreeMapSort {
    // Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
    // Слова с одинаковой длиной не должны “потеряться”.
    public static void main(final String[] args) {
        String input = "Если вы можете мечтать об этом вы можете это сделать";
        String[] arr = input.split(" ");
        Map<Integer, ArrayList<String>> map = new TreeMap<>();
        for (String item: arr) {
            int length = item.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }
            map.get(length).add(item);
        }
        System.out.println(getSortedIncludesWords(map));
    }

    public static String getSortedIncludesWords(final Map<Integer, ArrayList<String>> map){
        StringBuilder sb = new StringBuilder();
        for (Integer key: map.keySet()) {
            ArrayList<String> list = map.get(key);
            for (String string: list) {
                sb.append(String.format("%s %s", string, " "));
            }
        }
        return sb.toString();
    }
}
