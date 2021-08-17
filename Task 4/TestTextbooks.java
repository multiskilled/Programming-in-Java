/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgram;
//importing Arraylist form utilities package to store books in ArrayList
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mukesh
 */
public class TestTextbooks {
    
    public static void main(String[] args){
        
    //creating a new engineering textbook using the base class Textbook
    TextBook engineeringTextBook1=new EngineeringTextbook("Dr.James","Object Modelling Design","234","Object Modeling");
    //creating a second new engineering textbook using the base class Textbook
    TextBook engineeringTextBook2=new EngineeringTextbook("Dr. Bruce","Title","156","Interface Design");
    //creating a new Programming textbook using the base class Textbook
    TextBook programmingtextbook1=new ProgrammingTextbook("Dr.Robin","OOP's With Java","300","Java");
    //creating a seconf new programming textbook using the base class Textbook
    TextBook programmingtextbook2=new ProgrammingTextbook("Dr. Andrew"," Machine Learning with Python","430","Python");
    
    //creating a Array list and storing the above textbooks in theis arraylist
    List<TextBook> textBookList=new ArrayList<>();
    //adding the created textbooks using list inbuilt method add
    textBookList.add(engineeringTextBook1);             //Adding 1st engineering text book
    textBookList.add(engineeringTextBook2);                //Adding 2nd engineering text book
    textBookList.add(programmingtextbook1);               //Adding 1st Programming text book
    textBookList.add(programmingtextbook2);               //Adding 2nd Programming text book
    
    //Using for loopo to Display the text boooks
    for(int i=0;i<textBookList.size();i++){    //for loop runs untill i is less than textbook array list size
        System.out.println(textBookList.get(i));
        
    }
    }
    
    
}

