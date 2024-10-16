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

    System.out.println("");
    Point p4 = new Point(9,9);
    Point p5 = new Point(14,9);
    System.out.println( distance(p4,p5));
    System.out.println( Point.distance(p4,p5));
    System.out.println( p4.distanceTo(p5));
    Point p6 = new Point(10,10);
    Point p7 = new Point(10,14);
    System.out.println( distance(p6,p7));
    System.out.println( Point.distance(p6,p7));
    System.out.println( p6.distanceTo(p7));
    Point p8 = new Point(5,5);
    Point p9 = new Point(6,6);
    System.out.println( distance(p8,p9));
    System.out.println( Point.distance(p8,p9));
    System.out.println( p8.distanceTo(p9));

    System.out.println("");
    System.out.println("Testing Equalaterial Triangles");
    Point triangle1 = new Point(0,0);
    Point triangle2 = new Point(2,0);
    Point triangle3 = new Point(1,Math.sqrt(3));
    System.out.println("Distance from 1 to 2: " + distance(triangle1,triangle2));
    System.out.println("Distance from 2 to 3: " + Point.distance(triangle2,triangle3));
    System.out.println("Distance from 1 to 3: " + triangle1.distanceTo(triangle3));
  }
}
