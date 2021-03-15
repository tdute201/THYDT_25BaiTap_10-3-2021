package pkg25bai;
import java.util.Scanner;
public class Bai16 {
	private int year;
    public int tinhThu(int day, int month){
        int dayofweek;
        dayofweek = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
     (365 * (year + 4800 - ((14 - month) / 12))) +
     ((year + 4800 - ((14 - month) / 12)) / 4) - 
    ((year + 4800 - ((14 - month) / 12)) / 100) + 
    ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
        return dayofweek;
    }
    public int soNgayCuaThang(int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else
            if(month == 4 || month == 6 || month == 9 || month == 11)
                return 30;
            else
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    return 29;
                else
                    return 28;
    }
    public static void main(String[] args) {
        Bai16 b16 = new Bai16();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam (>1582): ");
        b16.year = scanner.nextInt();
        int thu, soNgay, d;
        for(int i = 1; i <= 12; i++){
            System.out.println("\nThang "+i);
            System.out.println("  S  M  T  W  T  F  S");
            thu = b16.tinhThu(1, i);
            soNgay = b16.soNgayCuaThang(i);
            d = 1;
            boolean kt = false;
            for(int j = 0; j < 7; j++)
                if(j == 0 && thu == 6 || j != 0 && j == (thu + 1) || kt == true)
                {
                    System.out.printf("%3d", d);
                    d++;
                    kt = true;
                }
                else
                    System.out.print("   ");
            System.out.println("");
            while(d <= soNgay){
                for(int k = 0; k < 7; k++)
                {
                    if(d <= soNgay){
                        System.out.printf("%3d", d);
                        d++;
                    }
                    else
                        System.out.print("   ");
                }
                System.out.println("");
            }
        }
    }
}
