package ProblemSolving;

import java.awt.print.PrinterGraphics;
import java.util.*;

public class MergedAndSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        List<Integer> newArr = new ArrayList<>();
        for (int j : arr1) {
            newArr.add(j);
        }
        for (int j : arr2) {
            newArr.add(j);

        }
            Collections.sort(newArr);

        System.out.println(newArr);
    }
}


