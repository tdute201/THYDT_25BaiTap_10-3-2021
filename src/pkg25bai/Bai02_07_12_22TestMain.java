/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25bai;

/**
 *
 * @author vando
 */
public class Bai02_07_12_22TestMain {
    public static void main(String[] args) {
        Bai02 b2 = new Bai02();
        Bai07 b7 = new Bai07();
        Bai12 b12= new Bai12();
        Bai22 b22= new Bai22();
        b2.getInformation();
        System.out.println("Khoang cach 2 diem AB la: "+b2.distanceAB());
        b7.getInformation();
        b7.GiaiPtBac1();
        b12.getInformation();
        b12.GiaiHePT();
        b22.getInformation();
        b22.UocSo();
    }
}
