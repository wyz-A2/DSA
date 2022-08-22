package com.wyz.sort;

import java.util.Arrays;

/**
 * @author
 * @date 2022/8/22
 * @description 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 9, 2, 5, 10, 15, 6, 2, 8, 1};
        bubbleSort_bitOperation(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 冒泡排序
     * @param array
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * 位运算优化
     * @param array
     */
    private static void bubbleSort_bitOperation(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
    }
}
