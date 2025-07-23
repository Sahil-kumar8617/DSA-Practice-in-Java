public class practice3 {
    public static void main(String[] args) {
        int arr[]={40,50,56,35,76,84,98,3,65};
        int sum=0;
        for(int number:arr){
            sum=sum+number;
            

        }
        int average=sum/arr.length;
        System.out.println("The averge of physics marks is:"+average);

    }
    
}
