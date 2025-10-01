public interface Vec {
    public void start();
    
}
class Car implements Vec {
    @Override public void start(){
        System.out.println("car started.");
    }

}
class Truck implements Vec {
    @Override public void start(){
        System.out.println("Truck started.");
    }

}
class Bus implements Vec {
    @Override public void start(){
        System.out.println("Bus started.");
    }

}