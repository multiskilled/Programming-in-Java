/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//improting requred packages- from input output and utilities
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mukesh
 */
public class TestStudents { 
    
// method for reading the student.txt file, setting the name,id and adding to array list 
    private static List<Student> readFile(File file) throws FileNotFoundException{
         List<Student> ListOfStudents=new ArrayList<Student>(); 
         
         
        Scanner scanner=new Scanner(file); //taking the file as input via scanner
        String line,Studentid, Studentname;               //declaring variables- id, name, and line
        Student newStudent=new Student();                  //creating a class object
         
        while(scanner.hasNextLine()){            //while loop for reading the next lines in the text file
            line=scanner.nextLine();                
            Studentid=line.substring(0,6);                 //ID will take  or read the chars from 0 to 6
            Studentname=line.substring(7);                 //name will take or read the chats of substring which are length of 7
            
            //student=new Student(Studentid, Studentname);
            newStudent.setStudentId(Studentid);                   //accessing the mutator from student class and setting the id
            newStudent.setStudentName(Studentname);               //accessing teh mutator from student class and setting student name
            
            ListOfStudents.add(newStudent);                //add student to the list of array( i,e students)
            
        }
        scanner.close();                                //closing the scanner 
        return ListOfStudents;                          //returns list of students
    }
    
    //method for writing the entered details into the text file(student list)
    private static boolean isWrittenInFile(Student student, File file) throws IOException{
        //PrintWriter printwriter=null;                           //initializing the printwriter and setting to null
        try{                                                    //Using exceptions
            PrintWriter printwriter=new PrintWriter(new BufferedWriter(new FileWriter(file, true)));  //creating new printwirter with new bufferwriter as parameter
                                                                                            //and takes in the students file ane seperates by using the system property
            printwriter.println(student.getStudentId()+ " "+ student.getStudentName());   // and gets the student id and name and write into file
            printwriter.close();
          
        }
        catch (IOException e){                                             //catch exception to catch the Input/output erroes
            e.printStackTrace();                                                                
        return false;                                                                       
        }
                                                                                      
            
        
   return true;                                                            //returns true if writing is done into file
    }
    
    
    //Main Mehtod
     public static void main(String args[]) throws IOException{             //
         File file=new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Assign3Task1\\src\\students.txt");
         List<Student> ListOfStudents=new ArrayList<>();        //creaiting an array list of students
            ListOfStudents=readFile(file);                      //reading the student txt file
            Scanner sc=new Scanner(System.in);                   //creating scanner input
            String Student_name, Student_id;                      //declaring variables
            char tryonceAgain='y';                                  
         
         //while to ask user again to enter name and ID, If y then asks to enter Id , name 
         //if N then program ends successfully
         while(tryonceAgain=='y' || tryonceAgain=='Y'){
             Student newStudent=new Student();   
             System.out.println("Please Enter Student ID: ");           //user enters ID
             Student_id=sc.next();                                      //Assigning the the input to Student_id
              
               //while loop to check if the entered ID is valid or not 
               //checks in the Student class
              while(!newStudent.isValidID(Student_id)){
            System.out.println("Apologies! ID id not valid");
            System.out.println("Enter Student ID ");
            Student_id=sc.next();
        }           //while loop to chekc if the entered ID exists in the student text file
              //Checks in student Class
               while(newStudent.IdExists(Student_id, ListOfStudents)){
            System.out.println("Apologies! ID alreay exists. Enter another Student ID again: ");
            System.out.println("Enter Student ID ");
            Student_id=sc.next();
        }
              
               System.out.println("Please enter student Name: ");
               Student_name=sc.next();
               newStudent.setStudentId(Student_id);//sets student ID
               newStudent.setStudentName(Student_name); //sets student Name
              
               ListOfStudents.add(newStudent);      //adds the new student list to array
              
             
               // if else statement to chekc if the file is written succesfully
               if(isWrittenInFile(newStudent, file)){
                System.out.println("File Written Sucessfull");
         }else {
               System.out.println("File is Not Written Sucessfully");
               }
            
               System.out.println("Do you want to enter another Student(Y/N): ");
               tryonceAgain=sc.next().charAt(0);            //asking user again to enter student id and name
             
        
         
         }
         
         sc.close();
         
     }
}