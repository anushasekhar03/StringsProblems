import java.util.Scanner;

public class StrtEndEmpty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        if(s.startsWith("a")){
            System.out.println("string starts with a");
        }
        else if(s.startsWith("Y")){
            System.out.println("Strig starts with y");
        }
        else if(s.endsWith("o")){
            System.out.println("String endss with o");
        }
        else if (s.isEmpty()){
            System.out.println("String is empty");
        }
    }
}
