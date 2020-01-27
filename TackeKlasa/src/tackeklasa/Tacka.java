
package tackeklasa;

public class Tacka {
    private double x,y;

    public Tacka() {
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public boolean equals(Tacka t){
        return this.x == t.x && this.y == t.y;
    
    }
    public void pomeranjeTacke(double dx, double dy){
        x +=dx;
        y+=dy;
        
    }
    public double rastojanjeTacaka(Tacka t){
        return Math.sqrt((this.x-t.x)*(this.x-t.x) + (y - t.y)*(y - t.y));
    }

    @Override
    public String toString() {
        return "Tacka{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
