package pkg25bai;
import java.util.Scanner;
public class Bai06 {
	public static void main(String[] args) {
        int a, b, c, tg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ba so: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("ba so vua nhap: "+a+", "+b+", "+c);
        if(a > b){
            tg = a;
            a = b;
            b = tg;
        }
        if(a > c){
            tg = a;
            a = c;
            c = tg;
        }
        if(b > c){
            tg = b;
            b = c;
            c = tg;
        }
        System.out.println("Sau khi sap xep tang dan: "+a+", "+b+", "+c);
    }

}
