package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 42;
        numbers[1] = 26;
        numbers[2] = 17;
        numbers[3] = 69;
        numbers[4] = 7;
        numbers[5] = 52;
        numbers[6] = 8;
        numbers[7] = 39;
        numbers[8] = 58;
        numbers[9] = 37;

        int[] numbers1 = new int[10];

        numbers1[0] = 28;
        numbers1[1] = -10;
        numbers1[2] = 74;
        numbers1[3] = 420;
        numbers1[4] = 81;
        numbers1[5] = 13;
        numbers1[6] = 2;
        numbers1[7] = 33;
        numbers1[8] = 52;
        numbers1[9] = 34;

        int[] numbers2 = new int[10];

        numbers2[0] = 57;
        numbers2[1] = 38;
        numbers2[2] = 66;
        numbers2[3] = 41;
        numbers2[4] = 110;
        numbers2[5] = 74;
        numbers2[6] = 24;
        numbers2[7] = 12;
        numbers2[8] = 1;
        numbers2[9] = 39;

        //Descending Bubble Sort
        System.out.println("|Descending Order|\n\nBefore bubble sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        System.out.println("\n\n====================================");
        //Descending Selection Sort
        System.out.println("\n\nBefore selection sort:");
        printArrayElements(numbers1);

        selectionSort(numbers1);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers1);

        System.out.println("\n\n====================================");
        //Descending Selection Sort
        System.out.println("\n\nBefore selection sort:");
        printArrayElements(numbers2);

        selectionSort1(numbers2);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers2);
    }
    private static void bubbleSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

            System.out.println("this");
            printArrayElements(arr);
        }
    }

    private static void selectionSort1(int[] arr)
    {
        for (int firstSortedIndex = 0; firstSortedIndex < arr.length ;firstSortedIndex++)
        {
            int largestIndex = arr.length-1;

            for (int i = arr.length -1; i >= firstSortedIndex; i--)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[firstSortedIndex];
            arr[firstSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + "  ");
        }
    }
}

