package sep_16;

//Write a program to remove duplicates from an array in Java without using the Java Collection API.
//The array can be an array of String, Integer or Character, your solution should be independent of the type of array.


import java.util.Arrays;

public class RemoveDupliacate<T> {
    private static int j = 0;

    Integer remove(T arr[]) {
        int i = 0;
        Arrays.sort(arr);
        T temp[] = (T[]) new Object[10];

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }

        temp[j++] = arr[i];

        for (int k = 0; k < j; k++) {
            arr[k] = temp[k];
        }
        return j;
    }
}

class main {
    public static void main(String[] args) {
        String arr[] = {"safari", "safari", "puma", "nike", "safari", "safari", "puma", "nike"};
        Integer a = new RemoveDupliacate().remove(arr);
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }
}
