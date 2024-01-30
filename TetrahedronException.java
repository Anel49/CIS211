public class TetrahedronException extends Exception{
    public TetrahedronException(){
        super("Must enter a valid value.");
    }
    public TetrahedronException(String msg){
        super(msg);
    }
}