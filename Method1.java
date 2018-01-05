public class Method1{
    public static Integer Umur(){
        return 25;
    }
    public static String Nama(){
        return "John connor";
    }
    public static void Perkenalan(){
        System.out.println("Nama saya "+ Nama() + ", Umur saya "+ Umur());
    }

    public static void sayMyname(String nama, int umur){
        System.out.println("Nama saya adalah "+nama+". dan berumur "+umur);
    }

    public static int luasPersegi(int sisi){
        return sisi*sisi;
    }
}