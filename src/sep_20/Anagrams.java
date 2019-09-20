package sep_20;
//Write a program to check if two given String is Anagram of each other.
// Your function should return true if two Strings are Anagram, false otherwise.
// A string is said to be an anagram if it contains the same characters and same length,
// but in a different order, e.g. army and Mary are anagrams.

public class Anagrams {
    public static boolean isAnagrams(String first, String second) {
        int countFirst[] = new int[256];
        int countSecond[] = new int[256];
        if (first.length() != second.length())
            return false;
        for (int i = 0; i < first.length(); i++) {
            countFirst[first.charAt(i)]++;
            countSecond[second.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (countFirst[i] != countSecond[i])
                return false;
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        String first = "whateverww";
        String second = "revetahwww";
        System.out.println(Anagrams.isAnagrams(first, second));

    }
}