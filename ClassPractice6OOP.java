/*
    ClassPractice6OOP 
    date: 2026-2-11 name: Nanxin Gao
*/
public class ClassPractice6OOP {
    public static void main(String[] args) {
        /*testing  */
        Point A = new Point(3, 4);
        Point B = new Point(6, 8);
        System.out.println("Distance of A from origin: " + A.distanceFromOrigin());
        System.out.println("Distance of B from origin: " + B.distanceFromOrigin());
        System.out.println("Distance between A and B: " + A.distanceFromAnotherPoint(B));
        System.out.println("Are A and B equal? " + A.isEqual(B));
        Point C = new Point(3, 4);
        System.out.println("Are A and C equal? " + A.isEqual(C));
    }
}

class Point {
    /*two instance variables
        - x: the x-coordinate of the point
        - y: the y-coordinate of the point
    three methods:
        - 1. distanceFromOrigin: This method calculates and returns the distance of the point from the origin (0, 0) using the formula: distance = sqrt(x^2 + y^2).
        - 2. distanceFromAnotherPoint: This method takes another Point object as a parameter and calculates the distance between the two points using the formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2).
        - 3. isEqual: This method takes another Point object as a parameter and checks if the two points have the same coordinates.
    */
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceFromAnotherPoint(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isEqual(Point other) {
        if (Math.abs(this.x - other.x) < 1e-6 && Math.abs(this.y - other.y) < 1e-6) {
            return true;
        } else {
            return false;
        }
    }
}