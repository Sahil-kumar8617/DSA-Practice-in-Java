public class pattern7 {
    public static void main(String[] args) {
        // 4 space 1 star, 3 space 3 star, 2 space 5 star , 1 space 7 star.
        pyramind(5);
    }
    public static void pyramind(int N){
        for(int i=0;i<N;i++){
            for(int j=1;j<j-i-1;j++){
                System.out.println(" ");

            }
           
        }
        
    }
}
