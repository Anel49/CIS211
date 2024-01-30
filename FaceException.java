public class FaceException extends ArithmeticException{
    public FaceException(){
        super("Must enter a valid value.");
    }
    public FaceException(String msg){
        super(msg);
    }
}
