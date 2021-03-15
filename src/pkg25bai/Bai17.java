package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai17 {
    public static int dayofWeek(int d, int m, int y){
        y = y -(14-m)/12;
        m += 12 * ( ( 14 - m ) / 12 ) - 2;
        return ( d + y + y / 4 - y / 100 + y / 400 + ( 31 * m ) / 12 ) % 7;
    }
    public static int soNgay(int month, int year){
        int i,sN;
        sN=0;
        for(i=1;i<month;i++){
            switch(i)
            {
                case 4: case 6: case 9: case 11: sN +=30; break;
                case 2: if((year%4==0&&year%100!=0)||(year%400==0))
                            sN+= 29;
                        else
                            sN+= 28; 
                        break;
                default: sN+= 31;
            }
        }
        return sN;
    }
    public static void Lich(int month, int year){
        int firstDay, i, j, maxDay, firstDoYear, soNgay,soLanTruc; //firstDoYear: thứ đầu tiên của năm  
        System.out.println("\nthang "+month);
        firstDoYear = dayofWeek(1,1,year);
        firstDay = dayofWeek(1,month,year);//tinh ngay dau moi thang
        soNgay = soNgay(month,year);//so ngày từ đầu năm đến đầu tháng cần tìm
        soLanTruc=0;
        for(i=1;i<=soNgay;i++)
            if((i+soNgay)%7!=0)
                soLanTruc++;
        switch(month)
            {
                case 4: case 6: case 9: case 11: maxDay =30; break;
                case 2: if((year%4==0&&year%100!=0)||(year%400==0))
                            maxDay = 29;
                        else
                            maxDay = 28; 
                        break;
                default: maxDay = 31;
            }
        System.out.println("S  M  T  W  T  F  S ");
        for(i=0;i<firstDay;i++)
            System.out.print("   ");
        for(i=1;i<=maxDay;i++)
            {
                System.out.format("%-3d",i);
                if((i+firstDay)%7==0)
                {
                    System.out.print("[ ]");
                    System.out.println("");
                }
                else
                {
                    int soDu;
                    soDu=(soLanTruc+i+firstDay)%5;
                    switch(soDu){
                        case 1: System.out.print("[A]");break;
                        case 2: System.out.print("[B]");break;
                        case 3: System.out.print("[C]");break;
                        case 4: System.out.print("[D]");break;
                        case 0: System.out.print("[E]");break;
                    }
                }
            }
        }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        System.out.println("nhap nam: ");
        year = sc.nextInt();
        System.out.println("nhap thang: ");
        month = sc.nextInt();
        //Lich(month,year);
        System.out.println(soNgay(month,year));
    }
    }

