import java.util.Scanner;
public class currencyDomenation2 {
    public static void main(String[] args) {
        int Note500,Note100,Note50,Note20,Note10,Note5,Note2,Note1;
        Note500=Note100=Note50=Note20=Note10=Note5=Note2=Note1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount:");
        int amount=sc.nextInt();

        if(amount>=500){
            Note500=amount/500;
            amount=amount-(Note500*500);
            System.out.println("500 Notes ="+Note500);
           
        }
         if(amount>=100){
            Note100=amount/100;
            amount=amount-(Note100*100);
            System.out.println("100 Notes="+Note100);
        }
         if(amount>=50){
            Note50=amount/50;
            amount=amount-(Note50*50);
            System.out.println("50 Notes="+Note50);

        }
        if(amount>=20){
            Note20=amount/20;
            amount=amount-(Note20*20);
            System.out.println("20 Notes="+Note20);

        }
        if(amount>=10){
            Note10=amount/10;
            amount=amount-(Note50*10);
            System.out.println("10 Notes="+Note10);

        }
        if(amount>=5){
            Note5=amount/5;
            amount=amount-(Note5*5);
            System.out.println("5 Notes="+Note5);

        }
        if(amount>=2){
            Note2=amount/2;
            amount=amount-(Note2*2);
            System.out.println("2Notes="+Note2);

        }
        if(amount>=1){
            Note50=amount/1;
            amount=amount-(Note50*1);
            System.out.println("1 Notes="+Note1);

        }
    }
    
}
