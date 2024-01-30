public class TaiChi extends Flexibility{
    /**
     * @return the muscles TaiChi exercises affect
     */
    @Override public Muscle[] muscleTargeted(){
        return new Muscle[] {Muscle.Arms, Muscle.Legs};
    }
    /**
     * overrides calorieLoss using weight, duration, and the intensity values associated with TaiChi 
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
                intensityDouble = 5.0;
                break;
            case MEDIUM:
                intensityDouble = 3.0;
                break;
            case LOW:
                intensityDouble = 1.5;
                break;
            default:
                intensityDouble = 0.0;
                break;
        }        
        return (intensityDouble * duration / 60) * weight;
    }
    /**
     * Fitness' description method overrode with a custom description for TaiChi
     */
    @Override public String description(){
        return "TaiChi";
    }
}
