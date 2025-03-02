class IFELSE1{
    public static void main(String[] args) {
        int num1=10,num2=20,num3=15;
        if(num1<num2 && num2 >num3){
            System.out.println(num2);
            
        }
        else if(num1>num2 && num1> num3){
            System.out.println(num1);

        }
        else{
            System.out.println(num3);
        }
    }
}