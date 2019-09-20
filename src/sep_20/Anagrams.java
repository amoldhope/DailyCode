package sep_20;

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