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

    public static void main(String[] args){
        Perkenalan();
    }
}