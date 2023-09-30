public class PalindromeString {
    public static boolean isPalindrome(String s) {
   
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String inputString = "Able was I ere I saw Elba";
        boolean result = isPalindrome(inputString);

        if (result) {
            System.out.println("\"" + inputString + "\" is a palindrome");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome");
        }
    }
}
