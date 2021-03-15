package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai15 {
    public static boolean namNhuan(int year){
        if((year%4==0 && year%100!=0) || (year%400==0))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, y, sum=0;
        System.out.println("Moi ban nhap: ");
        System.out.print("ngay: ");
        d = sc.nextInt();
        System.out.print("thang: ");
        m = sc.nextInt();
        System.out.print("nam: ");
        y = sc.nextInt();
        sum = (int)(30.42*(m-1))+d;
        if(m==2 ||((namNhuan(y)==true)&& m>2) )
            sum+=1;
        if(m>2 && m<8 )
            sum -=1;
        System.out.println("ngay thu: "+sum);
    }
}
