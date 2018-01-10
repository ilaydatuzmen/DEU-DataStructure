/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure_hw1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;

/**
 *
 * @author İlayda
 */
public class DataStructure_Hw1 {

    public static long getCPUTime() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : 0L;
    }

    public static void main(String[] args) {

        MergeSort ms = new MergeSort();

        int list_size;

        long endTime;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1->Merge Sort & 2->Insertion Sort");

        int secim = sc.nextInt();

        if (secim == 1) {

            System.out.println("Please enter 1 for Array Already Sorted");
            System.out.println("Please enter 2 for Random Array");
            System.out.println("Please enter 3 for Array Sorted Decreasing");
            int choice = sc.nextInt();
            if (choice == 1) {

                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();

                    long startTime = System.nanoTime();

                    ms.sort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Array Already Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }
            }

            if (choice == 2) {
                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();

                    long startTime = System.nanoTime();

                    ms.RandomSort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Random Ordering Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }
            }
            if (choice == 3) {
                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();

                    long startTime = System.nanoTime();

                    ms.Decreasingsort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Decreasing Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }

            }

        }

        if (secim == 2) {
            InsertionSort ins = new InsertionSort();

            System.out.println("Please enter 1 for Array Already Sorted");
            System.out.println("Please enter 2 for Random Array");
            System.out.println("Please enter 3 for Array Sorted Decreasing");
            int choice = sc.nextInt();
            if (choice == 1) {
                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();

                    long startTime = System.nanoTime();

                    ins.sort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Array Already Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }
            }

            if (choice == 2) {

                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();
                    long startTime = System.nanoTime();

                    ins.randomSort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Random Ordering Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }
            }

            if (choice == 3) {

                for (int i = 1; i <= 4; i++) {

                    System.out.println("Please enter list size");
                    list_size = sc.nextInt();
                    long startTime = System.nanoTime();

                    ins.DecreasingSort(list_size);

                    long estimatedTime = System.nanoTime() - startTime;

                    System.out.println("Decreasing Sorting Time with: " + list_size + " elements " + estimatedTime + " nanoseconds\n");

                }

            }

        }
    }
}
