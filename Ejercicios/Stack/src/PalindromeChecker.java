public class PalindromeChecker {
public static boolean isPalindrome(String text) {
        
        ArrayStack<Character> stack = new ArrayStack<>();
        StringBuilder textoLimpio = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (Character.isLetter(c)) {
                char cLower = Character.toLowerCase(c);
                
                textoLimpio.append(cLower);
                
                stack.push(cLower);
            }
        }
        
        String textoNormalizado = textoLimpio.toString();
        
        for (int i = 0; i < textoNormalizado.length(); i++) {
            char charDePila = stack.pop();
            char charDeTexto = textoNormalizado.charAt(i);
            
            if (charDePila != charDeTexto) {
                return false;
            }
        }

        return stack.isEmpty();
        
    }
    
}

