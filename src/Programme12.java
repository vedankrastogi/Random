import java.util.Scanner;
public class Programme12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int d=a/1000;
         int e=b/100;
         int f=e%10;
         int g=c%10;
         c=c/10;
         int sm=g;
         while(c>0){
             int h=c%10;
             if(h<g){
                 sm=h;
             }
             c=c/10;
         }
         int key=(d*f)+sm;
        System.out.println(key);

    }
}
