/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author Mukesh
 */
public class Student {
    
    
    //Declaring private variables
    private String StudentName; 
    private String StudentId;
    
    //constructor with Student ID and Student Name
    public Student(String StudentId, String StudentName){
       this.StudentId=StudentId;
       this.StudentName=StudentName;
   }
    //Default and no argument constructor
    public  Student(){
   }
    //Constructor for the student class with studentID as parameter
    public Student(String StudentId){
    this.StudentId=StudentId;
    }
    //Accessors and Mutators
    public String getStudentName() { //Accessor for Student Name
        return StudentName;
    }

    public void setStudentName(String StudentName) { //Mutator for Student Name
        this.StudentName = StudentName;
    }

    public String getStudentId() {  //Accessor for student ID
        return StudentId;
    }

    public void setStudentId(String StudentId) {    //Mutator for Student ID
        this.StudentId = StudentId;
    }
   
   
   
    //Overriding tostring method and returning Student Details
    @Override
    public String toString() {
        return "Student{" + "name='"+StudentName+'\''+
                ", id='"+StudentId + '\''+ '}';
    }
    //Method for checking if Entered ID is valid or not
    public static boolean isValidID(String StudentId){
        if(StudentId.length()!=6){      // checks if the ID length is not equals to 6, yes=return false
        return false; 
        }
        for(int i =0;i<StudentId.length();i++){         
            if(Character.isDigit(StudentId.charAt(i))==false) // checking the entered character is Digit 
        return false;
    }
        return true;                                                //return true if both if both are correct
    }
    //Method for checking if Entered ID exists in the File.
    public static boolean IdExists(String StudentId, List<Student> studentList){ //takes stident ID and list of students as parameter
        for(Student student:studentList){
            if(StudentId.equals(student.getStudentId())){   //checks if the student ID is equals to the entered student ID
            return true;                                        //IF id matches then returns ture ,eles false
            }
        }
    return false;
    }
   
    
    //main method 
     public static void main(String args[]){

     }
}
