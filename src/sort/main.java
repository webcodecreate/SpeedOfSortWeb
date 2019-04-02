package sort;

import java.io.FileNotFoundException;

public class main  {
    int [] arr;
    int n;
    public String startTimeString;
    public String bubbleSortRunString;
    public String recursiveBubbleSortString;
    public String selectionSortString;
    public String insertionSortString;
    public String recursiveInsertionSortString;
    public String mergeSortString;
    public String recursiveMergeSortString;
    public String quickSortString;
    public String iterativeQuickSortString;
    public String recursiveQuickSortString;
    public String heapSortString;
    public String radixSortString;
    public String shellSortString;
    public String combSortString;
    public String finallyTimeString;

    public int [] mainArray () throws FileNotFoundException {
        SpeedOfSort sof1 = new SpeedOfSort();
        int [] array = sof1.createArray();
        return array;
    }

    public main () throws FileNotFoundException {
        arr = mainArray();
        n = mainArray().length;
        this.startTimeString = SpeedOfSort.startTime();
        this.bubbleSortRunString = SpeedOfSort.bubbleSortRun(arr);
        this.recursiveBubbleSortString = SpeedOfSort.recursiveBubbleSortRun(arr, n);
        this.selectionSortString = SpeedOfSort.selectionSortRun(arr);
        this.insertionSortString = SpeedOfSort.insertionSortRun(arr);
        this.recursiveInsertionSortString = SpeedOfSort.recursiveInsertionSortRun(arr, n);
        this.mergeSortString = SpeedOfSort.mergeSortRun(arr, n);
        this.recursiveMergeSortString = SpeedOfSort.recursiveMergeSortRun(arr);
        this.quickSortString = SpeedOfSort.quickSortRun(arr, n);
        this.iterativeQuickSortString = SpeedOfSort.iterativeQuickSortRun(arr, n);
        this.recursiveQuickSortString = SpeedOfSort.recursiveQuickSortRun(arr, n);
        this.heapSortString = SpeedOfSort.heapSortRun(arr);
        this.radixSortString = SpeedOfSort.radixSortRun(arr, n);
        this.shellSortString = SpeedOfSort.shellSortRun(arr);
        this.combSortString = SpeedOfSort.combSortRun(arr);
        this.finallyTimeString = SpeedOfSort.finallyTime();
    }

    public static void main(String[] args) throws FileNotFoundException {
        SpeedOfSort sof1 = new SpeedOfSort();
        main m = new main();
        sof1.startTime();
        sof1.bubbleSortRun(m.mainArray());
        sof1.recursiveBubbleSortRun(m.mainArray(), m.n);
        sof1.selectionSortRun(m.mainArray());
        sof1.insertionSortRun(m.mainArray());
        sof1.recursiveInsertionSortRun(m.mainArray(), m.n);
        sof1.mergeSortRun(m.mainArray(), m.n);
        sof1.recursiveMergeSortRun(m.mainArray());
        sof1.quickSortRun(m.mainArray(), m.n);
        sof1.iterativeQuickSortRun(m.mainArray(), m.n);
        sof1.recursiveQuickSortRun(m.mainArray(), m.n);
        sof1.heapSortRun(m.mainArray());
        sof1.radixSortRun(m.mainArray(), m.n);
        sof1.shellSortRun(m.mainArray());
        sof1.combSortRun(m.mainArray());
        sof1.finallyTime();
    }
}