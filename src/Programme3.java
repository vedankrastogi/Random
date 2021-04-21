import java.util.Scanner;
public class Programme3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p=a;
        int c=0;
        while(a>0){
        int b=a%10;
         c=c+(b*b*b);
        a=a/10;
    }
        if(c==p){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        }

    }

