import java.util.*;

public class StudentTester{ 
   private String studentName;
   private int studentId;
   private float qualifiyingMarks;
   private char residerntialStatus;
   private int yearOfEngg;
   
// getter and setter methods
public String getStudentName(){
    return studentName;
}

public void setStudentName(String studentName){
    this.studentName= studentName;
}

public int getStudentId(){
    return studentId;
}

public void setStudentId(int studentId){
     this.studentId = studentId;

}

public float getqualifiyingMarks(){
    return qualifiyingMarks;
}

public void setqualifiyingMarks(float qualifiyingMarks){
     this.qualifiyingMarks= qualifiyingMarks;

}

public char getresiderntialStatus(){
    return residerntialStatus;
}

public void setresiderntialStatus(char residerntialStatus){
     this.residerntialStatus= residerntialStatus;

}

public int getyearOfEngg(){
    return yearOfEngg;
}

public void setyearOfEngg(int yearOfEngg){
     this.yearOfEngg= yearOfEngg;

}
public static void main(String[] args){
    // creation of the object of the clas
    StudentTester object= new StudentTester();

    // set the values

    object.studentName = "Pratik Bhalke";
    object.studentId= 65432;
    object.qualifiyingMarks = 82.1f;
    object.residerntialStatus = 'Y';
    object.yearOfEngg = 2023;
    // print the values
    System.out.println("Student Name: " + object.getStudentName());
    System.out.println("Student ID: " + object.getStudentId());
    System.out.println("Qualifying Marks:"+ object.getqualifiyingMarks());
    System.out.println("Residential Status: " + object.getresiderntialStatus());
    System.out.println("Year of Engineering: " + object.getyearOfEngg());   
}
}