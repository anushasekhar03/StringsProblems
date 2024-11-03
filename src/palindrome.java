public class palindrome {
    public static void main(String[] args) {
        String str="madam";
        char ch[]=str.toCharArray();
        char ch1[]=new char[str.length()];
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            ch1[j]=ch[i];
            j--;
        }
        String rev=new String(ch1);
        if(str.equals(rev)){
            System.out.println("Given String is palindrome.");
        }
        else{
            System.out.println("Given String is not a palindrome.");
        }

    }
}
