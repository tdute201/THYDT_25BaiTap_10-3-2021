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
public class Bai19 {
    public static String HieuThoiGian(int h1, int m1, int s1, int h2, int m2, int s2) {
        int time = Math.abs((h1 * 3600 + m1 * 60 + s1) - (h2 * 3600 + m2 * 60 + s2));
        System.out.println(time);
        return time/3600 + " gio " + (time%3600)/60 + " phut, " + (time%3600)%60 + " giay";
    }
    
    public static boolean KiemTra(int h1, int m1, int s1, int h2, int m2, int s2) {
        int dieukien = 0;
        if((h1 >= 0 && h1 <= 24) && (m1 >= 0 && m1 <=60) && (s1 >= 0 && s1 <= 60))
            dieukien++;
        if((h2 >= 0 && h2 <= 24) && (m2 >= 0 && m2 <=60) && (s2 >= 0 && s2 <= 60))
            dieukien++;
        return dieukien == 2;
    }
    public static void main(String[] args) {
        int hour1, minute1, second1;
        int hour2, minute2, second2;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            try{
                System.out.print("Nhap gio  [1]: ");
                hour1 = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap phut [1]: ");
                minute1 = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap giay [1]: ");
                second1 = Integer.parseInt(sc.nextLine());
                
                System.out.print("Nhap gio  [2]: ");
                hour2 = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap phut [2]: ");
                minute2 = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap giay [2]: ");
                second2 = Integer.parseInt(sc.nextLine());
                
                if(KiemTra(hour1, minute1, second1, hour2, minute2, second2))
                    break;
                System.out.println("Khong hop le!");
            } catch (NumberFormatException e) {
                System.out.println("Khong hop le!");
            }
        }
        
        System.out.println("Hieu thoi gian: " + HieuThoiGian(hour1, minute1, second1, hour2, minute2, second2));
    }
    
}
