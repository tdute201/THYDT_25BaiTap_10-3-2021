package pkg25bai;


public class Bai23 {
      public boolean ktrashh(int n){
        int s = 0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0)
                s= s+i;
        }
        if(s==n)
            return true;
        return false;
    }
    public void in(int n){
        for(int i=1;i<=n;i++){
            if(ktrashh(i))
                System.out.println(""+i);
        }
    }
    public static void main(String[] args) {
        Bai23 dt= new Bai23();
        System.out.println("Day so hoan hao <10000");
        dt.in(10000);
}
}
