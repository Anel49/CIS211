import InfoPackage.StudentInfo;
import InfoPackage.FacultyInfo;

public class CommandLineArgument{
    public static void main (String[] args){
        StudentInfo studentObj = new StudentInfo(args);
        System.out.println(studentObj.sdisplay());

        FacultyInfo facultyObj = new FacultyInfo(args);
        System.out.println(facultyObj.fdisplay());
    }
}