public class Programme9 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

