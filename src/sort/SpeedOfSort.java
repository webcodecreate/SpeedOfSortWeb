package sort;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeedOfSort {

    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int j = ar.length - 1; j > 0; j--)
        {
            int index = rnd.nextInt(j + 1);
            int a = ar[index];
            ar[index] = ar[j];
            ar[j] = a;
        }
    }
    static void printArray(int arr[]) {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        static int[] createArray () throws FileNotFoundException {
            Scanner scanner = new Scanner(new File("C:\\Users\\webco\\IdeaProjects\\JavaEEHey\\textfile.txt"));
            int[] array = new int[10000];
            int n = array.length;
            int i = 0;
            while (scanner.hasNextInt()) {
                array[i++] = scanner.nextInt();
            }
            return array;
        }

        static public String bubbleSortRun (int [] array) {
            //Bubble Sort
            SpeedOfSort.shuffleArray(array);
            long timeBubbleSortStart = new Date().getTime();

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.bubbleSort(array);

            long timeBubbleSortFinish = new Date().getTime();
            long timeBubbleSort = timeBubbleSortFinish - timeBubbleSortStart;
            String bubbleSortRunString = "Bubble Sort time is " + timeBubbleSort;
            return bubbleSortRunString;
        }

        static public String recursiveBubbleSortRun (int [] array, int n) {
            //Recursive Bubble Sort
            SpeedOfSort.shuffleArray(array);
            long timeRecursiveBubbleSortStart = new Date().getTime();

            RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
            recursiveBubbleSort.bubbleSort(array, n);

            long timeRecursiveBubbleSortFinish = new Date().getTime();
            long timeRecursiveBubbleSort = timeRecursiveBubbleSortFinish - timeRecursiveBubbleSortStart;
            String recursiveBubbleSortString = "Recursive Bubble Sort time is " + timeRecursiveBubbleSort + " milliseconds";
            return recursiveBubbleSortString;
        }

        static public String selectionSortRun (int [] array) {
            //Selection Sort
            SpeedOfSort.shuffleArray(array);
            long timeSelectionSortStart = new Date().getTime();

            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(array);

            long timeSelectionSortFinish = new Date().getTime();
            long timeSelectionSort = timeSelectionSortFinish - timeSelectionSortStart;
            String selectionSortString = "Selection Sort time is " + timeSelectionSort + " milliseconds";
            return selectionSortString;
        }

        static public String insertionSortRun (int [] array) {
            //Insertion Sort
            SpeedOfSort.shuffleArray(array);
            long timeInsertionSortStart = new Date().getTime();

            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(array);

            long timeInsertionSortFinish = new Date().getTime();
            long timeInsertionSort = timeInsertionSortFinish - timeInsertionSortStart;
            String insertionSortString = "Insertion Sort time is " + timeInsertionSort + " milliseconds";
            return insertionSortString;
        }

        static public String recursiveInsertionSortRun (int [] array, int n) {
            //Recursive Insertion Sort
            SpeedOfSort.shuffleArray(array);
            long timeRecursiveInsertionSortStart = new Date().getTime();

            RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
            recursiveInsertionSort.sort(array, n);

            long timeRecursiveInsertionSortFinish = new Date().getTime();
            long timeRecursiveInsertionSort = timeRecursiveInsertionSortFinish - timeRecursiveInsertionSortStart;
            String recursiveInsertionSortString = "Recursive Insertion Sort time is " + timeRecursiveInsertionSort + " milliseconds";
            return recursiveInsertionSortString;
        }

        static public String mergeSortRun (int [] array, int n) {
            //Merge Sort
            SpeedOfSort.shuffleArray(array);
            long timeMergeSortStart = new Date().getTime();

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(array, 0, n - 1);

            long timeMergeSortFinish = new Date().getTime();
            long timeMergeSort = timeMergeSortFinish - timeMergeSortStart;
            String mergeSortString = "Merge Sort time is " + timeMergeSort + " milliseconds";
            return mergeSortString;
        }

        static public String recursiveMergeSortRun (int [] array) {
            //Recursive Merge Sort
            SpeedOfSort.shuffleArray(array);
            long timeRecursiveMergeSortStart = new Date().getTime();

            RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort();
            recursiveMergeSort.sort(array);

            long timeRecursiveMergeSortFinish = new Date().getTime();
            long timeRecursiveMergeSort = timeRecursiveMergeSortFinish - timeRecursiveMergeSortStart;
            String recursiveMergeSortString = "Recursive Merge Sort time is " + timeRecursiveMergeSort + " milliseconds";
            return recursiveMergeSortString;
        }

        static public String quickSortRun (int [] array, int n) {
            //Quick Sort
            SpeedOfSort.shuffleArray(array);
            long timeQuickSortStart = new Date().getTime();

            QuickSort quickSort = new QuickSort();
            quickSort.sort(array, 0, n-1);

            long timeQuickSortFinish = new Date().getTime();
            long timeQuickSortSort = timeQuickSortFinish - timeQuickSortStart;
            String quickSortString = "Quick Sort time is " + timeQuickSortSort + " milliseconds";
            return quickSortString;
        }

        static public String iterativeQuickSortRun (int [] array, int n) {
            //Iterative Quick Sort
            SpeedOfSort.shuffleArray(array);
            long timeIterativeQuickSortStart = new Date().getTime();

            IterativeQuickSort iterativeQuickSort = new IterativeQuickSort();
            iterativeQuickSort.sort(array, 0, n-1);

            long timeIterativeQuickSortFinish = new Date().getTime();
            long timeIterativeQuickSort = timeIterativeQuickSortFinish - timeIterativeQuickSortStart;
            String iterativeQuickSortString = "Iterative Quick Sort time is " + timeIterativeQuickSort + " milliseconds";
            return iterativeQuickSortString;
        }

        static public String recursiveQuickSortRun (int [] array, int n) {
            //Recursive Quick Sort
            SpeedOfSort.shuffleArray(array);
            long timeRecursiveQuickSortStart = new Date().getTime();

            RecursiveQuickSort recursiveQuickSort = new RecursiveQuickSort();
            recursiveQuickSort.sort(array, 0, n-1);

            long timeRecursiveQuickSortFinish = new Date().getTime();
            long timeRecursiveQuickSort = timeRecursiveQuickSortFinish - timeRecursiveQuickSortStart;
            String recursiveQuickSortString = "Recursive Quick Sort time is " + timeRecursiveQuickSort + " milliseconds";
            return recursiveQuickSortString;
        }

        static public String heapSortRun (int [] array) {
            //Heap Sort
            SpeedOfSort.shuffleArray(array);
            long timeHeapSortStart = new Date().getTime();

            HeapSort heapSort = new HeapSort();
            heapSort.sort(array);

            long timeHeapSortFinish = new Date().getTime();
            long timeHeapSort = timeHeapSortFinish - timeHeapSortStart;
            String heapSortString = "Heap Sort time is " + timeHeapSort + " milliseconds";
            return heapSortString;
        }

        static public String radixSortRun (int [] array, int n) {
            //Radix Sort
            SpeedOfSort.shuffleArray(array);
            long timeRadixSortStart = new Date().getTime();

            RadixSort radixSort = new RadixSort();
            radixSort.sort(array, n);

            long timeRadixSortFinish = new Date().getTime();
            long timeRadixSort = timeRadixSortFinish - timeRadixSortStart;
            String radixSortString = "Radix Sort time is " + timeRadixSort + " milliseconds";
            return radixSortString;
        }

        static public String shellSortRun (int [] array) {
            //Shell Sort
            SpeedOfSort.shuffleArray(array);
            long timeShellSortStart = new Date().getTime();

            ShellSort shellSort = new ShellSort();
            shellSort.sort(array);

            long timeShellSortFinish = new Date().getTime();
            long timeShellSort = timeShellSortFinish - timeShellSortStart;
            String shellSortString = "Shell Sort time is " + timeShellSort + " milliseconds";
            return shellSortString;
        }

        static public String combSortRun (int [] array) {
            //Comb Sort
            SpeedOfSort.shuffleArray(array);
            long timeCombSortStart = new Date().getTime();

            CombSort combSort = new CombSort();
            combSort.sort(array);

            long timeCombSortFinish = new Date().getTime();
            long timeCombSort = timeCombSortFinish - timeCombSortStart;
            String combSortString = "Comb Sort time is " + timeCombSort + " milliseconds";
            return combSortString;
        }

        static public String startTime () {
            String startTimeString = "Start of the program " + java.time.LocalTime.now();
            return startTimeString;
        }

        static public String finallyTime () {
            String finallyTimeString = "Finish of the program " + java.time.LocalTime.now();
            return finallyTimeString;
        }
}
