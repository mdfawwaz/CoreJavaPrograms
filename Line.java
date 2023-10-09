package projectOne;
public class Line {
    private double m;
    private double c; 

    public Line(double m, double c) {
        this.m = m;
        this.c = c;
    }

    public double slope() {
        return m;
    }

    public double yIntercept() {
        return c;
    }

    public double distanceFrom(Point p) {      
        return Math.abs(m * p.xCoordinate() - p.yCoordinate() + c) / Math.sqrt(m * m + 1);
    }

    public Point intersection(Line other) {
      
        double x = (other.yIntercept() - c) / (m - other.slope());
        double y = m * x + c;
        return new Point(x, y);
    }
}

/*   
 *  Optional<Point>p2 = :ine.intersection(1,12);
 *  if(p2.isEmty()) 
 *  sys "Not available"
 *  else
 *  sys(p2);
 *  
 * 
 * 
 */
