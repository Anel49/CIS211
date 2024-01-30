public class Profile{
    /**
     * declares global variables
     */
    Gender gender;
    int age;
    double height;
    double weight;
    
    //TODO 
    /**
     * I made this method because it fixed an error
     */
    public Profile(){
        
    }
    /**
     * sets this obj's age, height, weight, and gender to their respective
     * params
     * @param age age of user
     * @param height height of user in meters
     * @param weight weight of user in kgs
     * @param gender sex of user
     */
    public Profile(int age, double height, double weight, Gender gender){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    /**
     * sets obj's height to param height
     * @param height user's height in meters
     */
    public void setHeight(double height){
        this.height = height;
    }
    /**
     * sets obj's weight to param weight
     * @param weight user's weight in kgs
     */
    public void setWeight(double weight){
        this.weight = weight;
    }
    /**
     * sets obj's age to param age
     * @param age user's age
     */
    public void setAge(int age){
        this.age = age;
    }
    /**
     * sets obj's gender to param gender
     * @param gender user's gender
     */
    public void setGender(Gender gender){
        this.gender = gender;
    }
    /**
     * 
     * @return current obj's height
     */
    public double getHeight(){
        return height;
    }
    /**
     * 
     * @return current obj's weight
     */
    public double getWeight(){
        return weight;
    }
    /**
     * 
     * @return current obj's age
     */
    public int getAge(){
        return age;
    }
    /**
     * 
     * @return current obj's gender
     */
    public Gender getGender(){
        return gender;
    }
    /**
     * @return a String containing the user's age, weight, height, and gender
     */
    @Override public String toString(){
        return "Age " + age + ", Weight " + weight + "kg, Height " + String.format("%.1f", height) + "m, Gender " + gender;
    }
    /**
     * 
     * @return the user's BMI using their weight and height
     */
    public double calcBMI(){
        return weight / Math.pow(height, 2);
    }
    /**
     * 
     * @return the user's expected caloric intake using their weight, height, age, and gender
     */
    public double dailyCalorieIntake(){
        if (gender == Gender.MALE){
            return 66.47 + (13.75 * weight) + (5.003 * height * 100) - (6.755 * age);
        }
        else{
            return 655.1 + (9.563 * weight) + (1.85 * height * 100) - (4.676 * age);
        }
    }
}