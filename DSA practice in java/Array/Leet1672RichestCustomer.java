public class Leet1672RichestCustomer {
    public static void main(String[] args) {
            int accounts[][]={ {2,8,7},{7,1,3},{1,9,5}};
        int wealth =0;
        int maxwealth=0;
        for(int i =0;i<accounts.length;i++){
            for(int j=0;j < accounts[i].length;j++){
                wealth=wealth+accounts[i][j];

            }
            if(wealth > maxwealth){
                maxwealth=wealth;
                
            }
            wealth=0;
            
        }
        System.out.println(maxwealth);
    }
}
