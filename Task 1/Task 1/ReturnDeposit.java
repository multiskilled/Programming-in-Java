//importing all(*) java packages
import java.util.*;

public class ReturnDeposit{
public static void main(final String args[]) {
    
    //Variable declerations
    double finalBalance,
           rate1=0.02,//Annual Interest rate In decimals because the rate is in percentage
           rate2=0.025,
           rate3=0.03,
           rate4=0.035,
           rate5=0.04,
           depositAmount,
           Interest=0,
           monthlyRate=0;
    int term;
    //Scanner allows system to read users input
     final Scanner input = new Scanner(System.in);
    //Enter client name
    System.out.print("Enter Client: ");
        String name = input.nextLine();
    //Enter Depostit amount 
    System.out.print("Enter Deposit Amount: ");
        depositAmount = input.nextInt();
    //Enter term in months or Years
    System.out.print("Term: ");
        term = input.nextInt();

    if(depositAmount>0 & depositAmount <=1000){
        //convert annual interest to monthly interest 
        monthlyRate=rate1/12;
    }
    else if(depositAmount >1000 & depositAmount<=5000){
        monthlyRate=rate2/12;
    }
    else if(depositAmount>5000 & depositAmount<=10000){
        monthlyRate=rate3/12;   
    }
    else if(depositAmount>10000 & depositAmount<=20000){
        monthlyRate=rate4/12;
    }
    else if(depositAmount>=20000){
        monthlyRate=rate5/12;
    }
    else{
        System.out.println("Please Enter correct value");
    }
    
       
       //Interest Earned calculation
    Interest=depositAmount*monthlyRate*term; 

     //adding deposit amount and interest earned to calulate final balance
    finalBalance = depositAmount + Interest;
    //closing scanner.
    input.close();
    
    System.out.println("-----------------------------------------\n"+ 
                       "                ABC Bank \n" +              
                       "            Return on Bank Deposits \n"+
                       "-----------------------------------------");
    System.out.println("Client : "+name);
    System.out.printf("Deposit Amount : $%.2f\n",depositAmount);
    System.out.println("Term : "+term +" months");
    System.out.printf("Interest Earned : $%.2f\n",Interest);
    System.out.printf("Final balance : $%.2f\n",finalBalance);
    System.out.println("-----------------------------------------");
}
}