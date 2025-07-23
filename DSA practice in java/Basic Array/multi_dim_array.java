public class multi_dim_array {
    public static void main(String[] args) {
        int Flats[][]={{101,102,103},{201,202,203},{301,302,303}
        };
        System.out.println(Flats.length );
        for(int i=0;i<=Flats.length;i++){
            for(int j=0;j<Flats[i].length;j++){
                System.out.println(Flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }


    }
    
}
