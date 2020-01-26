
package sfera;


public class Sfera {
   private double x,y,z, radius;

    public Sfera() {
    }

    public Sfera(double x, double y, double z, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
      this.radius = ispravanRadius(radius) ? radius : this.radius;
    }

    @Override
    public String toString() {
        return "Sfera{" + "x=" + x + ", y=" + y + ", z=" + z + ", radius=" + radius + '}';
    }

    private boolean ispravanRadius(double radius) {
        return radius > 0;
    }
    double zapremina(){
    return 4.0/3*radius*this.radius*radius*Math.PI;
    }
   
   
}
