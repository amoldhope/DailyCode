package sep_30;

public class CharacterFrequency {

    public static void main(String[] args) {
        String s = "this is Amol Dhope";
        frequencyCalculator(s);
    }

    private static void frequencyCalculator(String s) {
        int arr[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;

        }

        for(int i=0;i<256;i++){
            if(arr[i]>0){
                if(i != 32){
                    char c=(char)i;
                    System.out.println(c);
                    for(int j=0;j<i;j++){
                        System.out.println("*");
                    }
                }
            }
        }

    }
}
