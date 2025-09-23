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
// public enum Foo {
//    INSTANCE;
// }
// public final class Foo implements Serializable {

//     private static final long serialVersionUID = 1L;

//     private static class FooLoader {
//         private static final Foo INSTANCE = new Foo();
//     }

//     private Foo() {
//         if (FooLoader.INSTANCE != null) {
//             throw new IllegalStateException("Already instantiated");
//         }
//     }

//     public static Foo getInstance() {
//         return FooLoader.INSTANCE;
//     }

//     @SuppressWarnings("unused")
//     private Foo readResolve() {
//         return FooLoader.INSTANCE;
//     }
// }