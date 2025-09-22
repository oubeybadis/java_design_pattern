public class td1{

}
class Singleton {
    private static Singleton instance ;

    private Singleton(){

    }
    public static Singleton getSingleton(){
        if (instance == null){
            instance = new Singleton() ;
        }
        return instance ;
    }
}