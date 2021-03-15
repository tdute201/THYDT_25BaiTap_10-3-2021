package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai09 {
    static double pi=3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soPhut;
        double Do;
        System.out.print("nhap so phut: ");
        soPhut = sc.nextInt();
        Do = (double)(soPhut)/60;
        System.out.println("goc thu: "+( int )(Math.ceil(Do/90))% 4 );
    }
}
