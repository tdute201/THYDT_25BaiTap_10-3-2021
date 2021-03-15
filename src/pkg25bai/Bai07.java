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
public class Bai07 {
    double a, b;
    Scanner sc=new Scanner(System.in);
    public void getInformation()
    {
        System.out.println("Nhap a, b: ");
        System.out.print("a= ");
        a=sc.nextDouble();
        System.out.print("b= ");
        b=sc.nextDouble();
    }
    public void GiaiPtBac1()
    {
        if (a==0)
            if (b==0)
                System.out.println("Phuong trinh co vo so nghiem.");
            else
                System.out.println("Phuong trinh vo nghiem.");
        else
            System.out.println("x= "+(-b/a));
    }
}
