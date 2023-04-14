package ProblemSolving;

import java.util.Arrays;

public class ProductOfAllElement {
    public static int getMin(int[] array){
        int min = array[0];
        for(int num:array){
            if(num>min) min = num;
        }
        return min;
    }

    public static int getIndex(int[] nums, int num){
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == num) return i * nums[i];
        }
        throw new IllegalArgumentException("Try again");
    }
    public static int[] findProductOfElement(int[] array){
        int min = getMin(array);
        return new int[]{getIndex(array, min), getMin(array)};
    }

    public static void main(String[] args) {
        int[] array = {-12,-12,-12,-12};
        System.out.println(Arrays.toString(findProductOfElement(array)));
    }
}
