package pkg25bai;
import java.util.Random;
import java.util.Scanner;
public class Bai11 {
	private char hm, cpt;
    private int diemHM = 0;
    private int diemCPT = 0;
    public char ranCPT(){
        Random rand = new Random();
        int ranNum = rand.nextInt(3) + 1;
            if(ranNum == 1)
                return 'b';
            else
                if(ranNum == 2)
                    return 'd';
                else
                    return 'k';
    }
    public void tiSo(){
        if(hm == 'b' && cpt == 'd')
            diemHM++;
        if(hm == 'b' && cpt == 'k')
            diemCPT++;
        if(hm == 'd' && cpt == 'b')
            diemCPT++;
        if(hm == 'd' && cpt == 'k')
            diemHM++;
        if(hm == 'k' && cpt == 'b')
            diemHM++;
        if(hm == 'k' && cpt == 'd')
            diemCPT++;
    }
    public static void main(String[] args) {
        Bai11 b11 = new Bai11();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ky tu (b - d - k), ky tu khac de thoat: ");
        b11.hm = scanner.next().charAt(0);
        while(b11.hm == 'b' || b11.hm == 'd' || b11.hm == 'k'){
            b11.cpt = b11.ranCPT();
            System.out.println("Computer: "+b11.cpt);
            b11.tiSo();
            System.out.println("ty so� human - computer: "+b11.diemHM+" - "+b11.diemCPT);
            System.out.print("\nnhap ky tu (b - d - k), ky tu khac de thoat: ");
            b11.hm = scanner.next().charAt(0);
        }
    }

}
