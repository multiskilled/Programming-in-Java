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
public class EngineeringTextbook extends TextBook{
    //Declaring Private variable
    private String subject;

    //Accessor and Mutators
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    //Contructor which takes in author , title , pages and subjects as parameter
    public EngineeringTextbook(String author, String title, String pages, String subject){
            super(author, title, pages);
            this.subject=subject;
    
    }
    //Override the tostring method and return the details for Engineering textboox 
    //by accessing its author , pages and title using super.
    @Override
    public String toString() {
        return "EngineeringTextbook{"+"subject=" + subject + '\''+"author=" + super.getAuthor() + '\''+"title=" + super.getTitle() + '\''+
                "pages=" + super.getPages() + '\''+'}';
    }
    
   
    
}
