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
public class Bai22 {
    int n;
    Scanner sc=new Scanner(System.in);
    public void getInformation()
    {
        System.out.print("Nhap n: ");
        n=sc.nextInt();
    }
    public void UocSo()
    {
        int d=1, s=n;
        System.out.println("Cac uoc so cua "+n+" la: ");
        for (int i=1;i<=n/2;i++)
            if (n%i==0)
            {
                System.out.print(i+" ");
                d++;
                s+=i;
            }
        System.out.println(n+"");
        System.out.println("Co "+d+" uoc so");
        System.out.println("Tong cac uoc so la: "+s);
    }
}
