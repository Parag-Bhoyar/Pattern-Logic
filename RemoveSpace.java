package allasign;

public class RemoveSpace {

	    public static void main(String[] args) {

	        String s1 = "Java is strong";
	        String s2 = "Javaisstrong";


	        s1 = s1.replace(" ", "").toLowerCase();
	        s2 = s2.replace(" ", "").toLowerCase();

	        if (s1.equals(s2)) {
	            System.out.println("Strings are equal");
	        } else {
	            System.out.println("Strings are NOT equal");
	        }
	    }
	

}
