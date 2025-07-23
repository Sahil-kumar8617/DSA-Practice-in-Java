public class practice2 {
    public static void main(String[] args) {
        int Arr[]={5,3,6,3,6,8,9,4,23};
        int check=42;

                                  // method 1 to solve
        // for(int number:Arr){
        //     if(number==check){
        //         System.out.println("is present ");
        //     }
        //     else{
        //         System.out.println("Not present");
        //     }


        // }

                                  // method 2 to solve 
        boolean isInArr=false;
        for(int number:Arr){
            if(number==check){
                isInArr=true;
                break;
    
            }
        }
        if(isInArr){
            System.out.println("numbber is present in an array");
        }else{
            System.out.println("number is not present in an array");
        }
        

    }
}
