package pkg25bai;


import java.util.Scanner;


public class Bai08 {
     public  void ptb2(float a, float b, float c){
        if(a==0)
        {
            if(b==0)
                if(c==0)
                    System.out.println("PT vo so nghiem");
                else
                    System.out.println("PT vo nghiem");
            else
                    System.out.println("PT bac nhat co nghiem x= "+(-c/b));
        }
        
        else{
            float delta;
            delta= b*b-4*a*c;
            if(delta<0)
                System.out.println("Pt vo nghiem ");
            else{
                if(delta==0)
                    System.out.println("Pt co mot nghiem kep x= "+(-b*1.0/2*a));
                else{
                    System.out.println("Pt co 2 nghiem phan biet: ");
                    System.out.println("x1= "+(-b+Math.sqrt(delta))/2*a);
                    System.out.println("x2= "+(-b-Math.sqrt(delta))/2*a);
                }
            }
        }
    }
     public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        float a,b,c;
        System.out.println("Nhap a, b, c : ");
        a= nhap.nextFloat();
        b=nhap.nextFloat();
        c=nhap.nextFloat();
        Bai08 pt =new Bai08();
        pt.ptb2(a,b,c);
}
}
