import java.util.*;


public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        Point p2 = p1.copy();
    System.out.println(p2.getX());
    }
}

class Point  {
    private double x;
    private double y;

    public Point(double x ,double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
      return this.x;
    }
    // public Point(Point p){
    //     this.x = p.x;
    //     this.y = p.y;
    // }
    public Point copy(){
        return new Point(this.x,this.y);
    }
}
