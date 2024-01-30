public class Face {
    protected Point a;
    protected Point b;
    protected Point c;

    /**
     * Face constructor
     * @param a point 1
     * @param b point 2
     * @param c point 3
     * @throws FaceException if distances are not equal or the area of this is zero
     */
    public Face(Point a, Point b, Point c) throws FaceException{

        if (a.distance(b) != b.distance(c) && b.distance(c) != c.distance(a)){
            throw new FaceException("Points must be equidistant");
        } else if (this.area() == 0){
            throw new FaceException("A face can't have a zero area");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    /**
     * @return a String with the required format
     */
    @Override public String toString(){
        return "[" + a + "-" + b + "-" + c + "]";
    }
    /**
     * checks if param other equals this; if it does, return true,
     * else return false
     * @param other Object being compared to this
     * @return true or false depending on other's equality
     */
    @Override public boolean equals(Object other){
        if (this == other){
            return true;
        } else {
            return false;
        }
    }
    /**
     * checks if param other has an adjacent face to this
     * @param other Face object being compared to this
     * @return true if this shares a face with other,
     *         else returns false
     */
    public boolean adjacent(Face other){
        if (a == other.a || b == other.b || c == other.c){
            return true;
        } else {
            return false;
        }
    }
    /**
     * calculates the perimeter of this
     * @return the perimeter of this
     */
    public double edge(){
        return a.distance(b) + b.distance(c) + c.distance(a);
    }
    /**
     * calculates the area of this
     * @return the area of this using the formula for equilateral
     *         triangles
     */
    public double area(){
        return (Math.sqrt(3) / 4) * Math.pow(a.distance(b), 2);
    }
}