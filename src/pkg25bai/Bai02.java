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
public class Bai02 {
    double xA, yA, xB, yB;
    Scanner sc=new Scanner(System.in);
    public void getInformation()
    {
        System.out.println("Nhap toa do diem A: ");
        System.out.print("xA= ");
        xA=sc.nextDouble();
        System.out.print("yA= ");
        yA=sc.nextDouble();
        System.out.println("Nhap toa do diem B: ");
        System.out.print("xB= ");
        xB=sc.nextDouble();
        System.out.print("yB= ");
        yB=sc.nextDouble();
    }
    public double distanceAB()
    {
        return Math.sqrt(Math.pow((xB-xA), 2)+Math.pow((yB-yA), 2));
    }
}
