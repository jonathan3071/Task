class Point {
    private double x;
    private double y;
   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Method to scale the point closer by half to (0,0)
    public void scale() {
        this.x /= 2;
        this.y /= 2;
    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}

