package pkg25bai;


import java.util.Scanner;
public class Bai18 {
       public static void main(String[] args) {
        long h;
        Scanner obj=new Scanner(System.in);
        System.out.println("Nhap so gio: ");
        h=obj.nextLong();
        System.out.println(h/(24*7)+" tuan "+( (h%(24*7))/24)+" ngay "+((h%(24*7))%24)+" gio");
}
}
