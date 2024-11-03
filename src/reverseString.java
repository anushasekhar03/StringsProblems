import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char []arr =s.toCharArray();
        char []newArr=new char[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            newArr[j]=arr[i];
                    j--;
        }
        String rev=new String(newArr);
        System.out.println("original String : " + s);
        System.out.println("Reversed string : " + rev);
    }
}
