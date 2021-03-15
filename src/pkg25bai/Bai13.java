package pkg25bai;


import java.util.Scanner;


public class Bai13 {
     public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int d,m,y,top,dayofweek;
        System.out.println("Nhap vao ngay : ");
        d = nhap.nextInt();
        System.out.println("Nhap vao thang : ");
        m = nhap.nextInt();
        System.out.println("Nhap vao nam : ");
        y = nhap.nextInt();
        if(y<1582){
            System.out.println("Lich Gregorion bat dau tu nam 1582");
        }
        if(m<1 || m >12)
        {
            System.out.println("Thang khong hop le!!!");
        }
        switch(m){
            case 4: case 6: case 9: case 11: top =30; break;
            case 2:{
               if((y%4==0 && y%100!=0)||(y%400==0))
               {
                   top = 29;
               }
               else
               {
                   top = 28;
                       }
            } ; break;
            default : top = 31 ;
        }
        if(d<1||d>top){
            System.out.println("Ngay khong hop le");
        }else{
            System.out.println("Ngay hop le");
        }
        y-=(14-m)/12;
        m+=12*((14-m)/12)-2;
        dayofweek=(d+y+y/4-y/100+y/400+(31*m)/12)%7;
        if(dayofweek ==0){
            System.out.println("Chu nhat");
        }
        else{
            System.out.println("Thu "+(dayofweek+1));
        }
           
    }
}
