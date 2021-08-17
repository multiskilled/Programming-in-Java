//importing java package
import java.util.*;


public class ZooEntry{

    public static void main(final String args[]) {
    final Scanner input = new Scanner(System.in);
    //Declerations
    //Declaring ZOO Entry Charges
    int AccompaniedChild=2,UnAccompChild=5,Adults=10,Seniors=8,TotalEntry=0,Group;
    //number of persons
    int NoOfChilddren,NoOfAdults,NoOfSeniors,UnAccompanied ,TotalTakings=0;

    System.out.print("Enter a group? (Yes=1/No=0): ");
    Group=input.nextInt();
    while(Group==1){
        System.out.print("Enter the number of children (age 6–15): ");
        NoOfChilddren=input.nextInt();
        System.out.print("Enter the number of adults (age 16–59): "); 
        NoOfAdults=input.nextInt();
        System.out.print("Enter the number of seniors (age 60+): ");
        NoOfSeniors=input.nextInt();
        
        //calculation for getting the value of unaccompanied children
        //total number of adults + total number of seniors together subtracted from total number of childern
        UnAccompanied = NoOfChilddren-(NoOfAdults+NoOfSeniors);
        //checking if we have any unaccompanied children
        if(UnAccompanied>0){
            TotalEntry=((NoOfChilddren-UnAccompanied)*AccompaniedChild)+(NoOfAdults*Adults)+(NoOfSeniors*Seniors)+(UnAccompanied*UnAccompChild);
        }
        //if we have no unaccompanied child then we execute the else statement
        else{
            TotalEntry=((NoOfChilddren-UnAccompanied)*AccompaniedChild)+(NoOfAdults*Adults)+(NoOfSeniors*Seniors)+(UnAccompanied*AccompaniedChild);
        }
        System.out.println("Total entry charge is $"+ TotalEntry);
        System.out.println();
        //Asking user again to Enter a group:(Yes=1/No=0)
        System.out.print("Enter a group? (Yes=1/No=0): ");
        Group=input.nextInt();
        //totaltaking is addition of sequence of gourp entry chrages
        TotalTakings+=TotalEntry;


    }
    //prints out totaltakings for the sequence of  groups
    System.out.println("Total takings:$"+ TotalTakings);
    //closing scanner.
    input.close();
} 

}