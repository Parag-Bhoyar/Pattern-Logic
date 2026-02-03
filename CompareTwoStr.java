package allasign;
import java.util.Arrays;
public class CompareTwoStr {


	    public static void main(String[] args) {

	        String s1 ="tkkari";
	        String s2 = "kartik";

	        char[] a = s1.toCharArray();
	        char[] b = s2.toCharArray();

	   
	        Arrays.sort(a);
	        Arrays.sort(b);

	   
	        if (Arrays.equals(a, b)) {
	            System.out.println("Strings are equal after sorting");
	        } else {
	            System.out.println("Strings are NOT equal after sorting");
	        }
	    }
	
}
