/**
 * the abstract class Flexibility implements the interface Fitness. Flexibility creates two abstract
 * methods and one normal method its children must implement
 */
abstract class Flexibility implements Fitness{
    abstract public Muscle[] muscleTargeted();
    abstract public double calorieLoss(Intensity intensity, double weight, int duration);
    /**
     * Fitness' description method overrode with a custom description for Flexibility
     */
    @Override public String description(){
        return "Flexibility is uncomfortable and it takes time, so people don't like to do it.";
    }
}