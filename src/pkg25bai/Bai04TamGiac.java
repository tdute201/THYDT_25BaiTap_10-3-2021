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
public class Bai04TamGiac {
    
    private double aCanh, bCanh, cCanh;

    public Bai04TamGiac() {
    }
    
    public Bai04TamGiac(double aCanh, double bCanh, double cCanh) {
        this.aCanh = aCanh;
        this.bCanh = bCanh;
        this.cCanh = cCanh;
    }

    public double getaCanh() {
        return aCanh;
    }

    public void setaCanh(double aCanh) {
        this.aCanh = aCanh;
    }

    public double getbCanh() {
        return bCanh;
    }

    public void setbCanh(double bCanh) {
        this.bCanh = bCanh;
    }

    public double getcCanh() {
        return cCanh;
    }

    public void setcCanh(double cCanh) {
        this.cCanh = cCanh;
    }   

    public void DauVao() {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            try{
                System.out.printf("Nhap do dai canh thu nhat: ");
                aCanh = Double.parseDouble(sc.nextLine());
                System.out.printf("Nhap do dai canh thu hai: ");
                bCanh = Double.parseDouble(sc.nextLine());
                System.out.printf("Nhap do dai canh thu ba: ");
                cCanh = Double.parseDouble(sc.nextLine());
                if(aCanh > 0 && bCanh > 0 && cCanh > 0)
                    break;
                System.out.println("Ca 3 canh phai lon hon 0!");
            } catch(NumberFormatException e) {
                System.out.println("Khong hop le!");
            }                
        }
    }
    
    public String PhanLoaiTamGiac() {
        if(aCanh >= bCanh + cCanh || bCanh >= aCanh + cCanh || cCanh >= bCanh + aCanh)
            return "3 canh khong tao thanh tam giac";
        if(aCanh == bCanh || aCanh == cCanh || bCanh == cCanh) {
            if(aCanh*aCanh == bCanh*bCanh + cCanh*cCanh
            || bCanh*bCanh == aCanh*aCanh + cCanh*cCanh 
            || cCanh*cCanh == bCanh*bCanh + aCanh*aCanh)
                return "Tam giac vuong can";
            return "Tam giac can";
        }
        if(aCanh*aCanh == bCanh*bCanh + cCanh*cCanh
        || bCanh*bCanh == aCanh*aCanh + cCanh*cCanh 
        || cCanh*cCanh == bCanh*bCanh + aCanh*aCanh)
            return "Tam giac vuong";
        if(aCanh == bCanh && aCanh == cCanh)
            return "Tam giac deu";
        return "Tam giac thuong";
    }
    
    public double DienTich() {
        double p = (aCanh + bCanh + cCanh)/2;
        return Math.sqrt(p*(p - aCanh)*(p - bCanh)*(p - cCanh));
    }
    
    public void KetQua() {
        String loai = PhanLoaiTamGiac();
        System.out.println(loai);
        if("3 canh khong tao thanh tam giac".equals(loai) == false)
            System.out.println("Dien tich = " + Math.ceil(DienTich()*100)/100);
    }
}
