package ru.ikbo1319.experement.ex_14;

import java.util.Arrays;

public class SortTest {

    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }


    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0){ return;}
        if (left >= right){ return; }
        int middle = left + (right - left) / 2;
        int pivot = array[middle];

        int i = left, j = right;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }

    public static void binarySearch(int[]array, int key){
        int l = 0;
        int r = array.length;
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (array[mid] > key){
                r = mid;
            }
            else l = mid + 1;
        }
        r--;
        if (array[r] == key) {
            System.out.println("We found your key! :) " + key);
        }
        else {
            System.out.println("We can't found your key. :( ");
        }

    }


    public static void main(String[] args){
        long m = System.currentTimeMillis();
        System.out.println((double) (System.currentTimeMillis() - m));


        int[] arr1 = {134, 14, 0, 78, 89, 77, 657, 190, 2, 2, 56, 83};
        int[] resultMerge = mergeSort(arr1);
        System.out.println("Mergesort:");
        for (int i = 0; i < resultMerge.length; i++){
            System.out.print(resultMerge[i] + " ");
        }

        System.out.println(" ");

        int[] arr2 = {78, 94, 23, 6, 546, 209, 67, 156, 612, 5, 5, 212, 20, 34, 0};
        int left = 0;
        int right = arr2.length - 1;
        quickSort(arr2, left, right);
        System.out.println("Quicksort:");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Linear search:");

        int[] arr3 = {55,58, 90,87,267,67,344,723,0,12,2,76,544,833,83,934};
        int poisk = 344;
        int i;
        for (i = 0; i < arr3.length; i++) {
            if (arr3[i] == poisk) {
                System.out.println("Number " + poisk + " was found");
                break;
            }
        }
        if (i == arr3.length){
            System.out.println("Number " + poisk + " was not found");
        }

        System.out.println("Binary search:");

        int[] arr4 = {55,23,22,7,799,1 ,12,12,23,63,13,73};
        int key = 7;
        quickSort(arr4,0,arr4.length - 1);
        binarySearch(arr4,key);

    }
}
