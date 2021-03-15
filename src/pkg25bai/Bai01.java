package pkg25bai;
import java.util.Scanner;
public class Bai01 {
	 private final double PI = 3.141593;
	    private float S;
	    public float banKinh(){
	        return (float) Math.sqrt(S/(4.0*PI));
	    }
	    public float theTich(){
	        float R = banKinh();
	        return (float) ((4.0*PI*R*R*R)/3);
	    }
	    public static void main(String[] args) {
	        Bai01 tt = new Bai01();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("nhap dien tich: ");
	        tt.S = scanner.nextFloat();
	        System.out.println("the tich la: " + tt.theTich());
	    }
}
