package ru.mentee.power;

public class LiveCodingDemo {
    static void main() {
        printFizzBuzz(15);
        System.out.println(sumEven(new int[]{5, 6, 4}));
        System.out.println(findMax(new int[]{46, 3, 5, 6}));
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int sumEven(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }


    public static int findMax(int[] numbers) {
        if (numbers == null) {
            return Integer.MIN_VALUE;
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int number: numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }


}