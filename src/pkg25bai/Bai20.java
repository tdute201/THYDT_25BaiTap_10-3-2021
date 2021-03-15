package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai20 {
    public static int Tien(int schu){
        int tong = 0;
        if(schu < 100)
            tong+=schu*500;
        else
            if(schu<250)
                tong+=100*500+ (schu-100)*800;
            else
                if(schu<350)
                    tong+=100*500+(250-100)*800+(schu-250)*1000;
                else
                    tong+=100*500+(250-100)*800+(350-250)*1000+(schu-350)*1500;
        return tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soChu;
        System.out.print("nhap so kW tieu thu: ");
        soChu = sc.nextInt();
        System.out.println("Chi phi: "+Tien(soChu));
    }
}
