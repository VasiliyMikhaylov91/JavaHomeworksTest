package Lesson006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = getArray();
        System.out.println(getPercentUnique(arr));
    }

    public static Integer[] getArray() {
        int length = 100;
        Integer[] res = new Integer[length];
        Random rm = new Random();
        for (int i = 0; i < length; i++) {
            res[i] = rm.nextInt(24);
        }
        return res;
    }

    public static double getPercentUnique(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item: array) {
            if(!map.containsKey(item)) {
                map.put(item, 0);
            }
            map.put(item, map.get(item) + 1);
        }
        int countUnique = 0;
        for (Integer key: map.keySet()) {
            if (map.get(key) == 1) countUnique++;
        }
        return (double) ((double)countUnique * 100.0 /(double) array.length);
    }
}
