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
abstract public class TextBook {
    
    //private variable declerations
    private String author, title, pages;
    
    //Accessors and Mutators
    public String getAuthor() {
        return author;
    }
    //sets the author value 
    public void setAuthor(String author) {
        this.author = author;
    }
    //access the title
    public String getTitle() {
        return title;
    }
    //Mutates the title of textbook
    public void setTitle(String title) {
        this.title = title;
    }
    //access the pages of the textbook
    public String getPages() {
        return pages;
    }
    //Mutates the pages of textbook
    public void setPages(String pages) {
        this.pages = pages;
    }
    //Contructor which takes in author , title , pages as parameters
    public TextBook(String author,String title, String pages){
        this.author=author;
        this.title=title;
        this.pages=pages;
    
    }
    public TextBook(){}
    
    //Override the toString method and returns the Textbook details as String
    @Override
    public String toString() {
        return "TextBook{" +
                "author=" + author + '\''+
                ", title=" + title + '\''+
                ", pages=" + pages + '\''+
                '}';
    }
    
    
    
    
    
    
}

