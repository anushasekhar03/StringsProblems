public class CountVowelsConsSpaces {
    public static void main(String[] args) {
        String str="Java developer in Microsoft";
        str.toLowerCase().toCharArray();
        int vowels=0;
        int consonants=0;
        int spaces=0;

        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            } else if(str.charAt(i)==' '){
                spaces++;
            }
            else if(str.charAt(i) >='a' && str.charAt(i)<='z') {
            consonants++;
            }
        }
        System.out.println("Vowels are: "+vowels);
        System.out.println("Consonants are: "+consonants);
        System.out.println("Spaces are: "+ spaces);
    }
}
