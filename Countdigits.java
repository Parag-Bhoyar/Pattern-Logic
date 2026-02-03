package allasign;

public class Countdigits {
	public static void main(String[] args) {
        String str = "Hello123World456";
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
    }
}
