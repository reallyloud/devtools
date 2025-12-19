package ru.mentee.power.devtools.student;

public class GateFindMax {

    static void main() {
        int[] array = {3, 7, 2, 9, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
