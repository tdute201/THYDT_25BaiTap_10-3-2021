package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai25 {
    public static int UCLN(int a, int b){
        while(a!=b)
            if(a>b)
                a-=b;
            else
                b-=a;
        return a;
    }
    public static int BCNN(int a, int b){
        return a*b/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("nhap a: ");
        a = sc.nextInt();
        System.out.print("nhap b: ");
        b = sc.nextInt();
        System.out.println("UCLN = "+UCLN(a,b));
        System.out.println("BCNN = "+BCNN(a,b));
    }
}
