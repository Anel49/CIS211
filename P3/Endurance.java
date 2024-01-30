/**
 * the abstract class Endurance implements the interface Fitness. Endurance creates two abstract
 * methods and one normal method its children must implement
 */
abstract class Endurance implements Fitness{
    abstract public Muscle[] muscleTargeted();
    abstract public double calorieLoss(Intensity intensity, double weight, int duration);
    /**
     * Fitness' description method overrode with a custom description for Endurance
     */
    @Override public String description(){
        return "Endurance is all about sweat and patience.";
    }
}