/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author thien
 */
public class Bai24 {
    public static int SoChuSo(long bNum) {
        int count = 0;
        while(bNum > 0) {
            count++;
            bNum /= 10;
        }
        return count;
    }
    
    public static int ChuSoCuoi(long bNum) {
        if(SoChuSo(bNum) > 1)
            return  (int) (bNum%10);
        return (int) bNum;
    }
    
    public static int ChuSoDau(long bNum) {
        int soChuSo = SoChuSo(bNum);
        if(soChuSo > 1)
            return (int) (bNum/(Math.pow(10, soChuSo - 1)));
        return (int) bNum;
    }
    
    public static int TongCacChuSo(long bNum) {
        int sum = 0;
        while(bNum > 0) {
            sum += bNum%10;
            bNum /= 10;
        }
        return sum;
    }
    
    public static long DaoNguoc(long bNum) {
        long cNum = 0;
        while(bNum> 0) {
            cNum  = cNum*10 + bNum%10;
            bNum /= 10;
        }
        return cNum;
    }

    public static void main(String[] args) {
        long aNum;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            try{
                System.out.print("Nhap mot so tu nhien: ");
                aNum = Integer.parseInt(sc.nextLine());
                
                if(aNum >= 0)
                    break;
                System.out.println("So tu nhien phai >= 0!");
            } catch(NumberFormatException e) {
                System.out.println("Khong hop le!");
            }
        }
        
        System.out.println("So Chu so: " + SoChuSo(aNum));
        System.out.println("Chu so cuoi cung: " + ChuSoCuoi(aNum));
        System.out.println("Chu so dau tien: " + ChuSoDau(aNum));
        System.out.println("Tong cac chu so: " + TongCacChuSo(aNum));
        System.out.println("So Dao Nguoc: " + DaoNguoc(aNum));
    }
    
}
