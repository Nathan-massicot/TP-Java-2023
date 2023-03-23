//Exercice 1 

//a
public class Main {
}

public class Point {
}
public class Main {
    public static void main(String[] args) {
        Point p0, p1;
        p0 = new Point();
        p0.x = 3.1;
        p0.y = 5.3;
        p1 = new Point(1.2, 3.4);
        System.out.println("p1("+p1.x+","+p1.y+")");

        System.out.println("Distance entre p0 et p1: "+Point.distanceStat(p0, p1));
        System.out.println("Distance entre p0 et p1: "+p0.distance(p1));

    }
}
