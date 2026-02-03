package allasign;

public class IgnorePalindrome {
	

	    public static void main(String[] args) {

	        String str = "A man, a kartik, a canal: Pakama";

	        str = str.toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        boolean isPalindrome = true;

	        while (left < right) {

	            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
	                left++;
	            }
	            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
	                right--;
	            }

	            if (str.charAt(left) != str.charAt(right)) {
	                isPalindrome = false;
	                break;
	            }

	            left++;
	            right--;
	        }

	        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
	    }
	}
