//package locationsDistance;



public class location {
    private int x;
    private int y;
    static  private int a;
    static  private int b;
    
    private double distance;

    public location(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        double temp = (x - a) * (x - a) + (y - b) * (y - b);
        distance = Math.sqrt(temp);
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        location.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        location.b = b;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println(this.x + ", " + this.y + ", " + this.getDistance());
    }

    public String toString() {
        return (this.x + ", " + this.y + ", " + this.getDistance());
    }

}
