// import java.util.LinkedList;
// import java.util.Scanner;


// public class td1{

// }
// class Singleton {
//     private static Singleton instance ;

//     private Singleton(){

//     }
//     public static Singleton getSingleton(){
//         if (instance == null){
//             instance = new Singleton() ;
//         }
//         return instance ;
//     }
// }
// // public enum Foo {
// //    INSTANCE;
// // }
// // public final class Foo implements Serializable {

// //     private static final long serialVersionUID = 1L;

// //     private static class FooLoader {
// //         private static final Foo INSTANCE = new Foo();
// //     }

// //     private Foo() {
// //         if (FooLoader.INSTANCE != null) {
// //             throw new IllegalStateException("Already instantiated");
// //         }
// //     }

// //     public static Foo getInstance() {
// //         return FooLoader.INSTANCE;
// //     }

// //     @SuppressWarnings("unused")
// //     private Foo readResolve() {
// //         return FooLoader.INSTANCE;
// //     }
// // }
//  class Main {
//    public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter type");
//         String type = scan.nextLine();

//         Vec vec = VecFactory.create(type);
//         vec.start();
//         scan.close();
//    }
//  }

// class VecFactory {
// //    private LinkedList<String> categoryies ;
//     public static Vec create(String type){
//         switch (type.toLowerCase()) {
//             case "car": return new Car();
//             case "bus": return new Bus();
//             case "truck": return new Truck();
                
        
//             default:
//                 throw new illegalArgumentExeption("dsdws"+type);
//         }
//     }
//     //singletone
// }
// public interface  Vec {
//     // public void create(String type);
//     public void start();
    
//  }
// class Car implements Vec {
//     @Override public void start(){
//         System.out.println("car started.");
//     }

// }
// class Truck implements Vec {
//     @Override public void start(){
//         System.out.println("Truck started.");
//     }

// }
// class Bus implements Vec {
//     @Override public void start(){
//         System.out.println("Bus started.");
//     }

// }