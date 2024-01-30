public class Tetrahedron {
    protected Face a;
    protected Face b;
    protected Face c;
    protected Face d;

    /**
     * Tetrahedron constructor
     * @param a sets this.a to Face a
     * @param b sets this.b to Face b
     * @param c sets this.c to Face c
     * @param d sets this.d to Face d
     */
    public Tetrahedron(Face a, Face b, Face c, Face d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    /**
     * supposed to create a Tetrahedron object with 4 points
     * @param a point 1
     * @param b point 2
     * @param c point 3
     * @param d point 4
     */
    public Tetrahedron(Point a, Point b, Point c, Point d){

    }
    /**
     * calculates area
     * @return the total area of this
     */
    public double area(){
        return a.area() + b.area() + c.area() + d.area();
    }
    /**
     * calculates volume
     * @return the total volume of this
     */
    public double volume(){
        return (Math.pow((a.a.distance(a.b)), 3) * Math.sqrt(2)) / 12;
    }
}
