public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point px = new Point(p1);
    System.out.println(px);
    Point p2 = new Point(-1,-1);
    Point py = new Point(p2);
    System.out.println(py);
    Point p3 = new Point(3,4);
    Point pz = new Point(p3);
    System.out.println(pz);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}
