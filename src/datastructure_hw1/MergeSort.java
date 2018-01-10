/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure_hw1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author İlayda
 */
public class MergeSort {

    static void mergesort(int array[]) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; ++i) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; ++i) {
            right[i - mid] = array[i];
        }
        mergesort(left);
        mergesort(right);
        merge(array, left, right);

    }

    public static void merge(int array[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public void sort(int listSize) {

        int[] array = new int[listSize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }

     //   printArray(array);
        mergesort(array);
     //   printArray(array);

    }

    public void RandomSort(int listSize) {
        int[] array = new int[listSize];
        Random rand = new Random();

        for (int i = 0; i < listSize; i++) {

            array[i] = rand.nextInt(array.length);

        }

     //   printArray(array);
        mergesort(array);
      //  printArray(array);

    }

    public void Decreasingsort(int listSize) {

        int[] array = new int[listSize];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            array[index] = i;
            index++;
        }
       printArray(array);
        mergesort(array);
      //  printArray(array);

    }

    public void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("\n");

    }

}
