package allasign;

public class Loweruppercase {
	public static void main(String[]args) {
		String str = "Hellowwww,javavavja";
		int upper=0;
		int lower=0;
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') 
            {
                upper++;
            } else if (ch >= 'a' && ch <= 'z')
            {
                lower++;
            }
        }
		
		
	 System.out.println("No of uppercase letters: " + upper);
     System.out.println("No of lowercase letters: " + lower);
	
}
}
