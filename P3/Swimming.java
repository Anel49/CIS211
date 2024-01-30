public class Swimming extends Aerobic{
    SwimmingType type;
    /**
     * @return the muscles Swimming exercises affect depending on the obj's SwimmingType
     */
    @Override public Muscle[] muscleTargeted(){
        switch (type){
            case Butterflystroke:
                return new Muscle[] {Muscle.Abs, Muscle.Back, Muscle.Shoulders, Muscle.Biceps, Muscle.Triceps};
            case Breaststroke:
                return new Muscle[] {Muscle.Glutes, Muscle.Cardio};
            case Freestyle:
                return new Muscle[] {Muscle.Arms, Muscle.Legs, Muscle.Cardio};
            default:
                return null;
        }
    }
    /**
     * overrides calorieLoss using weight, duration, and the intensity values associated with Swimming 
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
                intensityDouble = 10.0;
                break;
            case MEDIUM:
                intensityDouble = 8.3;
                break;
            case LOW:
                intensityDouble = 6.0;
                break;
            default:
                intensityDouble = 0.0;
                break;
        }
        return (intensityDouble * duration / 60) * weight;
    }
    /**
     * sets obj's type to the SwimmingType Freestyle
     * if no param is given
     */
    public Swimming(){
        type = SwimmingType.Freestyle;
    }
    /**
     * sets obj's type to param type
     * @param type the SwimmingType for this obj
     */
    public Swimming(SwimmingType type){
        this.type = type;
    }
    /**
     * Fitness' description method overrode with a custom description for Swimming
     */
    @Override public String description(){
        return "Swimming";
    }    
    /**
     * sets obj's type to param type
     * @param type the SwimmingType type
     */
    public void setSwimmingType(SwimmingType type){
        this.type = type;
    }
    /**
     * 
     * @return current obj's SwimmingType type
     */
    public SwimmingType getSwimmingType(){
        return type;
    }    
}

