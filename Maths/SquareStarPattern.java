import java.util.Scanner;
public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the N:");
        int N=sc.nextInt();

        for(int i=0;i<=N-1;i++){
            for(int j=0;j<=N-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
