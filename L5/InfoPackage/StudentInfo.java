import InfoPackage;

public class StudentInfo{
    String Name;
    int ID;
    double CGPA;

    /**
     * this constructor assigns the this Name, ID, and CGPA from the parameters
     * @param Name student name
     * @param ID student ID
     * @param CGPA student CGPA
     */
    public StudentInfo (String[] args){
        this.Name = args[0];
        this.ID = args[1];
        this.CGPA = args[2];
    }

    /**
     * 
     * @returns a string with the student's name, ID, and CGPA
     */
    public String sdisplay (){
        return ("Student Name: " + Name + ", ID: " + ID + ", CGPA: " + CGPA);
    }
}