package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String so;
        int kt, s1=0, s2=0,doDai,i, x;
        do {
            System.out.println("Moi ban nhap: (nhap 0 de thoat)");
            so = sc.nextLine();
            doDai = so.length();
            kt = Integer.parseInt(""+so.charAt(doDai-1));
            for(i=1;i<=doDai-1;i+=2)
                s1+=Integer.parseInt(""+so.charAt(i-1));
            for(i=2;i<=doDai-1;i+=2){
                x = Integer.parseInt(""+so.charAt(i-1));
                if((x*2)<10)
                    s2+=(x*2);
                else
                {
                    int soDu=0;
                    x*=2;
                    soDu =x%10;
                    x/=10;
                    s2+=x+soDu;
                }
            }
            if((s1+s2+kt)%10==0)
                System.out.println("SIN hop le!");
            else
                System.out.println("SIN khong hop le!");
        } while (!"0".equals(so));
            
    }
}
