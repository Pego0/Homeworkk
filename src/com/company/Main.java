package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] firstTaskPartOne = new int[]{1, 2, 3};
        float[] firstTaskPartTwo = new float[]{1.56F, 7.654F, 9.986F};
        int[] firstTaskPartThree = new int[]{10, 20, 30};
        for (int i = 0; i < firstTaskPartOne.length - 1; i++) {
            System.out.println(firstTaskPartOne[i] + ", ");
        }
        System.out.println(firstTaskPartOne[firstTaskPartOne.length - 1]);
        for (int i = 0; i < firstTaskPartTwo.length - 1; i++) {
            System.out.println(firstTaskPartTwo[i] + ", ");
        }
        System.out.println(firstTaskPartTwo[firstTaskPartTwo.length - 1]);
        for (int i = 0; i < firstTaskPartThree.length - 1; i++) {
            System.out.println(firstTaskPartThree[i] + ", ");
        }
        System.out.println(firstTaskPartThree[firstTaskPartThree.length - 1]);
        for (int i = firstTaskPartOne.length - 1; i >= 1; i--) {
            System.out.println(firstTaskPartOne[i] + ", ");
        }
        System.out.println(firstTaskPartOne[0]);
        for (int i = firstTaskPartTwo.length - 1; i >= 1; i--) {
            System.out.println(firstTaskPartTwo[i] + ", ");
        }
        System.out.println(firstTaskPartTwo[0]);
        for (int i = firstTaskPartThree.length - 1; i >= 1; i--) {
            System.out.println(firstTaskPartThree[i] + ", ");
        }
        System.out.println(firstTaskPartThree[0]);
        for (int i = 0; i < firstTaskPartOne.length; i++) {
            if (firstTaskPartOne[i] % 2 != 0) {
                System.out.println(firstTaskPartOne[i] + 1);
            } else {
                System.out.println(firstTaskPartOne[i]);
            }
        }
    }
}