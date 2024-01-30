public class PullUp extends Endurance{
    /**
     * @return the muscles PullUp exercises affect
     */
    @Override public Muscle[] muscleTargeted(){
        return new Muscle[] {Muscle.Biceps, Muscle.Arms};
    }
    /**
     * overrides calorieLoss using weight, duration, and the intensity values associated with PullUp 
     * exercises
     * @param intensity intensity of the workout
     * @param weight weight of the user
     * @param duration duration of the workout in minutes
     * @return the calorie loss of the exercise
     */
    @Override public double calorieLoss(Intensity intensity, double weight, int duration){
        double intensityDouble;
        switch (intensity){
            case HIGH:
                intensityDouble = 7.5;
                break;
            case MEDIUM:
                intensityDouble = 6.0;
                break;
            case LOW:
                intensityDouble = 4.8;
                break;
            default:
                intensityDouble = 0.0;
                break;
        }        
        return (intensityDouble * duration / 60) * weight;
    }
    /**
     * Fitness' description method overrode with a custom description for PullUp
     */
    @Override public String description(){
        return "PullUp";
    }
}