import java.util.Scanner;

public class numdivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three nums: ");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        boolean res=numdivide(n,n1,n2);
        System.out.println(res);
    }
    public static boolean numdivide(int n, int n1, int n2) {
        if (n % n1 == 0 && n % n2 == 0) {
            return true;
        }
        return false;
    }
}