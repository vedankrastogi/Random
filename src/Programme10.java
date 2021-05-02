public class Programme10 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            for(int k=0;k<5;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

