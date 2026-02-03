package allasign;

public class MostFrequent {
		    public static void main(String[] args) {

	        String str = "programming";
	        str = str.toLowerCase();

	        int[] freq = new int[256]; 

	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;
	        }

	        char maxChar = ' ';
	        int maxCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            if (freq[str.charAt(i)] > maxCount) {
	                maxCount = freq[str.charAt(i)];
	                maxChar = str.charAt(i);
	            }
	        }

	        System.out.println("Most frequent character: " + maxChar);
	        System.out.println("Frequency: " + maxCount);
	    }
	}
