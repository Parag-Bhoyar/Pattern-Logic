package allasign;

public class RemoveSpecial {

    public static void main(String[] args)
    {

        String s1 = "A@man#";
        String s2 = "kartik";

        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        s2 = s2.replaceAll("[^a-zA-Z0-9]", "");

        if (s1.equalsIgnoreCase(s2)) 
        {
            System.out.println("Strings are equal");
        } else 
        {
            System.out.println("Strings are NOT equal");
        }
    }
}
