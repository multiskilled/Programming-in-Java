/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgram;

/**
 *
 * @author Mukesh
 */
public class ProgrammingTextbook extends TextBook{
    //declaring private string variable
    private String language;
    //Creating Accessors and Mutators
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    //Contructor which takes in author , title , pages and language as parameter
    public ProgrammingTextbook(String author, String title, String pages, String language){
        super(author, title, pages);
        this.language=language;
    
    }
    //Override the toString method and returns the details for Programming textboox 
    //by accessing its author , pages and title using super.
    @Override
    public String toString() {
        return "ProgrammingTextbook{" +
                "language=" + language +'\''+
                "author=" + super.getAuthor() + '\''+
                "title=" + super.getTitle() + '\''+
                "pages=" + super.getPages()+ '\''+
                '}';
    }
    
    
    
    
    
    
}
