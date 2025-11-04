public class App {
    public static void main(String[] args) throws Exception {
        String test1 = "Anita lava la tina";
        String test2 = "Hola";
        String test3 = "Somos o no somos";

        System.out.println("'" + test1 + "' -> " + PalindromeChecker.isPalindrome(test1));
        System.out.println("'" + test2 + "' -> " + PalindromeChecker.isPalindrome(test2));
        System.out.println("'" + test3 + "' -> " + PalindromeChecker.isPalindrome(test3));
    }
}
