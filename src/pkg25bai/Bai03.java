package pkg25bai;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        double xC, yC, R, xM, yM, d;
        System.out.println("Nhap toa do tam C(xC, yC)");
        xC = nhap.nextDouble();
        yC = nhap.nextDouble();
        System.out.println("Nhap ban kinh R :");
        R = nhap.nextDouble();
        System.out.println("Nhap toa do M(xM,yM) : ");
        xM = nhap.nextDouble();
        yM = nhap.nextDouble();
        d=R-Math.sqrt((xM-xC)*(xM-xC)+(yM-yC)*(yM-yC));
        if(d > 0)
            System.out.println("M nam trong C ");
        else{
            if(d<0)
                System.out.println("M nam ngoai C ");
            else
                System.out.println("M nam tren C ");
        }

    }

}
