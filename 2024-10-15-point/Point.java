public class Point{
  private double x,y;

  public String toString(){
    return "(" + getX() + ", " + getY() + ")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    this.x = other.getX();
    this.y = other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    return Math.sqrt(Math.pow((x - other.getX()), 2) + Math.pow((y - other.getY()), 2));
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    double aX = a.getX();
    double aY = a.getY();
    double bX = b.getX();
    double bY = b.getY();
    return Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
  }


}
