public class Image{
    Tile tileObj;
/**
 * The following are constructors that create Image objects. If no parameters
 * are passed, a new Tile object is created. Both objects are assigned to
 * tileObj.
 */
    public Image(){
        tileObj = new Tile();
    }
    public Image(Tile t){
        tileObj = t;
    }  
/**
 * The following set and get the bottom left, center, top left, top right, and
 * bottom right tile points by grabbing tileObj's x and y value and
 * adding to it to reach the desired points.
 */
    public void setBottomLeft(Tile p){
        tileObj = p;
    }
    public Tile getBottomLeft(){
        return tileObj;
    }
    public Point getCenter(){
        int newx = tileObj.getBottomLeft().getX() + 49;
        int newy = tileObj.getBottomLeft().getY() + 49;
        return new Point(newx, newy);
    }
    public Point getTopLeft(){
        int newx = tileObj.getBottomLeft().getX();
        int newy = tileObj.getBottomLeft().getY() + 99;
        return new Point(newx, newy);
    }
    public Point getTopRight(){
        int newx = tileObj.getBottomLeft().getX() + 99;
        int newy = tileObj.getBottomLeft().getY() + 99;
        return new Point(newx, newy);
    }
    public Point getBottomRight(){
        int newx = tileObj.getBottomLeft().getX() + 99;
        int newy = tileObj.getBottomLeft().getY();
        return new Point(newx, newy);
    }
/**
 * This method gets the tile in the row and column passed. If the row or
 * column is less than 1 or greater than 10, null is returned; else, a new Tile
 * with a new Point is created and returned.
 */
    public Tile getTile(int row, int column){

        if ((row < 1) || (row > 10) || (column < 1) || (column > 10)){
            return null;
        }
        else{
            int newx = (column * 10) - 10 + tileObj.getBottomLeft().getX();
            int newy = (row * 10) - 10 + tileObj.getBottomLeft().getY();
            return new Tile(new Point(newx, newy));
        }
    }
}