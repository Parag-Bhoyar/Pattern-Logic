package allasign;



public class Duplicatechar {
    public static void main(String[] args) {

        String str = "programming";
        str = str.toLowerCase();

        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 1) {
                System.out.println(str.charAt(i));
                freq[str.charAt(i)] = 0; 
            }
        }
    }
}

