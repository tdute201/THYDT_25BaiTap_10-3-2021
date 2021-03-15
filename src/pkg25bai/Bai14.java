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
public class Bai14 {
    
    public static String NgayTiepTheo(int d, int m, int y) {
        switch(m) {
            case 2:
                if(d == 29)
                    if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
                        return  1 +"/" + (m+1) +"/"+ y;
                if(d == 28)
                        return  1 +"/" + (m+1) +"/"+ y;
            case 4: case 6: case 9: case 11:
                if(d == 30)
                    return  1 +"/" + (m+1) +"/"+ y;
            default:
                if(d == 31){
                    if(m == 12)
                        return  1 +"/" + 1 +"/"+ (y+1);
                    return  1 +"/" + (m+1) +"/"+ y;
                }
        }
        return (d+1) +"/" + m +"/"+ y;
    }
    
    public static String NgayTruocDo(int d, int m, int y) {
        switch(m) {
            case 3:
                if(d == 1){     
                    if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))                 
                        return  29 +"/" + (m-1) +"/"+ y;
                    return 28 +"/" + (m-1) +"/"+ y;
                }
            case 2: case 4: case 6: case 9: case 11:
                if(d == 1)
                    return  31 +"/" + (m-1) +"/"+ y;
            default:
                if(d == 1){
                    if(m == 1)
                        return  31 +"/" + 12 +"/"+ (y-1);
                    return  30 +"/" + (m-1) +"/"+ y;
                }
        }
        return (d-1) +"/" + m +"/"+ y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 1, month = 1, year = 1;
        while(true) {   
            while(true) {
            try{
            System.out.print("Nhap ngay: ");
            day = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap thang: ");
            month = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap nam :");
            year = Integer.parseInt(sc.nextLine());
            
            if(day > 0 && month > 0 && year > 0)
                break;
            System.out.println("Ngay thang nam khong hop le!");
            } catch(NumberFormatException e) {
                System.out.println("Ngay thang nam khong hop le!");
            }
        }
        
        System.out.println("Ngay tiep theo la: " + NgayTiepTheo(day,month,year));
        System.out.println("Ngay truoc do  la: " + NgayTruocDo(day,month,year));
        }
    }
}
