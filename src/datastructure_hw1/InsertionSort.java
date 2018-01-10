/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure_hw1;

import java.util.Random;

/**
 *
 * @author İlayda
 */
public class InsertionSort {

    public void insertion_sort(int A[]) {

        for (int j = 1; j < A.length; j++) {
            int key = A[j];

            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    public void sort(int listSize) {

        int[] array = new int[listSize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }

        //  printArray(array);
        insertion_sort(array);
        // printArray(array);

    }

    public void randomSort(int listSize) {

        int[] array = new int[listSize];
        Random rand = new Random();

        for (int i = 0; i < listSize; i++) {

            array[i] = rand.nextInt(array.length);

        }

        // printArray(array);
        insertion_sort(array);
        //   printArray(array);

    }

    public void DecreasingSort(int listSize) {
        int[] array = new int[listSize];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            array[index] = i;
            index++;
        }
        // printArray(array);
        insertion_sort(array);
        //printArray(array);

    }

    public void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("\n");

    }

}
