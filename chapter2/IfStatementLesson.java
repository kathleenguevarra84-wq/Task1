package chapter2;
public class IfStatementLesson {
    public static void main(String[] args) {
        int hourOfDay = 18;
        //int hourOfDay = 12;
        //if (hourOfDay<11) {
        //    System.out.println ("Good Morning!"); }
        //if (hourOfDay >=11){
        //System.out.println ("Kumain ka na ba?"); }

    //If-else
        System.out.println ("(iF - Else Statement)"); 
        if (hourOfDay<11) 
            System.out.println ("Good Morning!"); 
        else 
            System.out.println ("Good afternoon!"); 
        System.out.println ("Good afternoon!");  //curly brace matters if there or more than 1 statement for println
   
   //if - else if - else
        System.out.println ("(iF - Else If - Else Statement)"); 
        if (hourOfDay>=18) 
            System.out.println ("Good Evening!"); 
        else if (hourOfDay >=12)
            System.out.println ("Good Afternoon!"); 
        else
            System.out.println ("Good Morning!");  

    }
}

