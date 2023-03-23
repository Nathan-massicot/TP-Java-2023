public class Point {

double x;

double y;

public Point() {}

public Point(double x, double y)
    {
    this.x = x;
    this.y = y;
    }

public void afficher()
    {
    System.out.print("("+x+","+y+")");
    }
public double distance(Point p)
    {
    return Point.distanceStat(this, p);
    }

public static double distanceStat(Point p1, Point p2)
    {
    double dist = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    return dist;
    }

}