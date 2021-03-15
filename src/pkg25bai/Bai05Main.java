package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author NhuY
 */
public class Bai05Main {
    public static double DienTich(Bai05ToaDoTamGiac a,Bai05ToaDoTamGiac b,Bai05ToaDoTamGiac c ){
        return 1.0*Math.abs(a.x*b.y-b.x*a.y+b.x*c.y-c.x*b.y+c.x*a.y-a.x*c.y)/2;
    }
    public static void main(String[] args) {
       Bai05ToaDoTamGiac  A = new Bai05ToaDoTamGiac();
       Bai05ToaDoTamGiac  B = new Bai05ToaDoTamGiac();
       Bai05ToaDoTamGiac  C = new Bai05ToaDoTamGiac();
       Bai05ToaDoTamGiac  M = new Bai05ToaDoTamGiac();
       double sABC, sABM, sBCM,sACM;
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap toa do diem A: ");
       System.out.print("xA= ");
       A.x = sc.nextDouble();
       System.out.print("yA= ");
       A.y = sc.nextDouble();
       System.out.println("nhap toa do diem B: ");
       System.out.print("xB= ");
       B.x = sc.nextDouble();
       System.out.print("yB= ");
       B.y = sc.nextDouble();
       System.out.println("nhap toa do diem C: ");
       System.out.print("xC= ");
       C.x = sc.nextDouble();
       System.out.print("yC= ");
       C.y = sc.nextDouble();
       System.out.println("nhap toa do diem M: ");
       System.out.print("xM= ");
       M.x = sc.nextDouble();
       System.out.print("yM= ");
       M.y = sc.nextDouble();
       sABC = DienTich(A,B,C);
       sABM = DienTich(A,B,M);
       sBCM = DienTich(B,C,M);
       sACM = DienTich(A,C,M);
       if(sABC==(sABM+sBCM+sACM))
            System.out.println("diem M nam trong tam  giac ABC");
       else
            System.out.println("diem M nam ngoai tam giac ABC");
    }
    
}
