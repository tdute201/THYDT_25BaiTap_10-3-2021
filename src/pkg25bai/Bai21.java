package pkg25bai;
import java.util.Scanner;
public class Bai21 {
	private float diemChuan, mon1, mon2, mon3;
    private char kv;
    private int dt;
    public float diemKhuVuc(){
        if(kv == 'A')
            return 2;
        else
            if(kv == 'B')
                return 1;
            if(kv == 'C')
                return (float) 0.5;
            else
                return 0;
    }
    
    public float diemDoiTuong(){
        if(dt == 1)
            return (float) 2.5;
        else
            if(dt == 2)
                return (float) 1.5;
            if(dt == 3)
                return (float) 1;
            else
                return 0;
    }
    public void xetDiem(){
        float tongDiem = mon1 + mon2 + mon3 + diemKhuVuc() + diemDoiTuong();
        if(tongDiem >= diemChuan)
            System.out.println("dau ["+tongDiem+"]");
        else
            System.out.println("rot ["+tongDiem+"]");
    }
    public static void main(String[] args) {
        Bai21 b21 = new Bai21();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap diem chuan: ");
        b21.diemChuan = scanner.nextFloat();
        System.out.print("nhap diem 3 mon thi: ");
        b21.mon1 = scanner.nextFloat();
        b21.mon2 = scanner.nextFloat();
        b21.mon3 = scanner.nextFloat();
        System.out.print("nhap khu vuc (A, B, C, X): ");
        b21.kv = scanner.next().charAt(0);
        System.out.print("nhap doi tuong (1, 2, 3, 0): ");
        b21.dt = scanner.nextInt();
        b21.xetDiem();
    }
}
