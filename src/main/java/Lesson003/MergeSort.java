package Lesson003;

import java.util.Arrays;

public class MergeSort {
    static int[] sortArray = {7, 0, -4, 3, 1, -2, 5};

    //Разделяем массив на две части и рекурсивно делим его
    //до тех пор пока середина не сравняется с одним из меркеров
    //затем выполняем механизм сортировки для левой и правой уже отсоритрованных частей массива
    static void sort(int leftMarker, int rightMarker) {
        if (leftMarker < rightMarker) {
            int middle = (leftMarker + rightMarker) / 2;
            sort(leftMarker, middle);
            sort(middle + 1, rightMarker);
            merge(leftMarker, middle, rightMarker);
        }
    }

    //механизм сортировки
    static void merge(int leftMarker, int middle, int rightMarker) {
        // делим массив на две части
        // добавляем каждой части ещё один элемент и ложим в него максимальное значение
        int leftArrayLength = middle - leftMarker + 1;
        int rightArrayLength = rightMarker - middle;
        int[] leftArray = new int[leftArrayLength + 1];
        int[] rightArray = new int[rightArrayLength + 1];
        for (int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = sortArray[leftMarker + i];
        }
        for (int i = 1; i <= rightArrayLength; i++) {
            rightArray[i - 1] = sortArray[middle + i];
        }
        leftArray[leftArrayLength] = Integer.MAX_VALUE;
        rightArray[rightArrayLength] = Integer.MAX_VALUE;
        // определяем счетчики элементов массивов
        int countLeft = 0;
        int countRight = 0;
        // сортируем части массива если левом массиве значение меньше чем в правом записываем его в итоговый массив
        // иначе записываем число из правого массива в том массиве откуда записали делаем инкремент счетчика
        for (int i = leftMarker; i <= rightMarker; i++) {
            if (leftArray[countLeft] < rightArray[countRight]) {
               sortArray[i] = leftArray[countLeft];
               countLeft++;
            } else {
                sortArray[i] = rightArray[countRight];
                countRight++;
            }
        }
    }

    public static void main(String[] args) {
        sort(0, sortArray.length - 1);
        System.out.println(Arrays.toString(sortArray));
    }
}
