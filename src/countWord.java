public class countWord {
    public static void main(String[] args) {
        String str = "I am a software developer";
        int count = 0;

        // Use a for loop to count spaces between words, or use split for easier implementation
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // Check for space character
                count++;
            }
        }
        // Add one to the count since there’s always one more word than spaces
        count += 1;
        System.out.println("Word count: " + count);
    }
}
