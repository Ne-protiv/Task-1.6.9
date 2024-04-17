public class Task {
    public static void main(String[] args) {
        String text ="Was it a cat I saw?";
        boolean result = isPalindrome(text);
        System.out.println(result);
    }
    public static boolean isPalindrome(String text) {
        String cleanedString = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder bufferString =new StringBuilder(cleanedString).reverse();
        String reverseString = new String(bufferString);
        return (cleanedString.equalsIgnoreCase(reverseString));
    }
}
