package sep_17;

import java.util.Arrays;

public class GenericDuplicateRemove<E> {
    private static int j = 0;

    Integer remove(E arr[]) {
        int i = 0;
        Arrays.sort(arr);
        E temp[] = (E[]) new Object[10];

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
        Integer a = new GenericDuplicateRemove().remove(arr);
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }

}
