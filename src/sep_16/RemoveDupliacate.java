package sep_16;

//Write a program to remove duplicates from an array in Java without using the Java Collection API.
import java.util.Arrays;

public class RemoveDupliacate<T> {
    private static int j = 0;
    static Integer remove(Integer arr[]) {
        Integer temp[] = new Integer[10];
        Arrays.sort(arr);
        int i = 0;
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
        Integer arr[] = {12, 22,4,56,66,66,55, 33, 22, 22, 33, 33, 33};
        Integer a = RemoveDupliacate.remove(arr);
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }
}
