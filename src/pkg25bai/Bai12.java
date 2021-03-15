/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25bai;

import java.util.Scanner;

/**
 *
 * @author vando
 */
public class Bai12 {
    double a1, b1, c1;
    double a2, b2, c2;
    Scanner sc=new Scanner(System.in);
    public void getInformation()
    {
        System.out.println("Nhap he phuong trinh: ");
        System.out.print("a1= ");
        a1=sc.nextDouble();
        System.out.print("b1= ");
        b1=sc.nextDouble();
        System.out.print("c1= ");
        c1=sc.nextDouble();
        System.out.print("a2= ");
        a2=sc.nextDouble();
        System.out.print("b2= ");
        b2=sc.nextDouble();
        System.out.print("c2= ");
        c2=sc.nextDouble();
    }
    public void GiaiHePT()
    {
        double D, Dx, Dy, x, y;
        D = a1*b2-a2*b1;
        Dx = c1*b2-c2*b1;
        Dy = a1*c2-a2*c1;
        if (D==0)
            if (Dx+Dy==0)
                System.out.println("Phuong trinh co vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        else
        {
            x=Dx/D;
            y=Dy/D;
            System.out.println("Phuong trinh co nghiem (x,y)= {"+x+", "+y+")");
        }
    }
}
