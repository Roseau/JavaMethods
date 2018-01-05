public class AplikasiMethod2{
    public static void showYourName(String nama, int umur){
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
    }
    public static String Scare(){
        return "BOOOOOOOOOO";
    }
    public static void luasPersegiPanjang(int panjang, int lebar){
        System.out.println("Luas persegi panjang "+panjang*lebar);
    }
    public static void luasLingkaran(int jari){
        System.out.println("Luas lingkaran dengan sisi "+jari+" adalah : "+jari*jari*3.14);
    }
    public static void luasPersegi(int sisi){
        System.out.println("Luas dari persegi dengan sisi "+sisi+" adalah : "+sisi*sisi);
    }
    private static void tampilPersegi(int s){
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(i==j){
                    System.out.print("#");
                }else{
                    System.out.print("&");
                }
            }
            if(i%2==0){
                System.out.println("---");
            }else{
                System.out.println("%");
            }
            
        }
    }
    public static String Surprise(){
        return Scare();
    }
    public static void printPersegi(int s){
        tampilPersegi(s);     
    }

}