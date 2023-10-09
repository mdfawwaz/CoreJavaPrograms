package projectOne;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double xCoordinate() {
        return x;
    }

    public double yCoordinate() {
        return y;
    }

    public double distanceFrom(Point other) {
        double calculateX = x - other.x;
        double calculateY = y - other.y;
        return Math.sqrt(calculateX * calculateX + calculateY * calculateY);
    }
}