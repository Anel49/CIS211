public class Point {
    protected double x;
    protected double y;
    protected double z;

    /**
     * Point constructor
     * @param x sets this' x value
     * @param y sets this' y value
     * @param z sets this' z value
     * @throws ArithmeticException if x, y, or z are less than 0
     */
    public Point(double x, double y, double z) throws ArithmeticException{
        if (x < 0){
            throw new ArithmeticException("Invalid value " + x + "for coordinate x");
        } else if (y < 0){
            throw new ArithmeticException("Invalid value " + y + "for coordinate y");
        } else if (z < 0){
            throw new ArithmeticException("Invalid value " + z + "for coordinate z");
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    /**
     * @return a String with the required format
     */
    @Override public String toString(){
        return "{" + x + "," + y + "," + z + "}";
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
     * calculates the distance between two points
     * @param other the second point needed
     * @return the distance between this and other using distance formula
     */
    public double distance(Point other){
        return Math.abs(Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2)));
    }
}