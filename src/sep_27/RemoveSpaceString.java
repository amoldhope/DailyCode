package sep_27;

import java.util.Arrays;

public class RemoveSpaceString {



  static   int j=0;

    public static void main(String[] args) {
        String s="Hii this is amol dhope from innovecture";
        char arr[]=RemoveSpaceString.remove(s);

        for (int i=0;i<j;i++) {
            System.out.println(arr[i]);
        }

    }

    private static char[] remove(String s) {


        char arr[]=new char[s.length()];
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) != 32)
                arr[j++]=s.charAt(i);
        }

        return arr;
    }

}
