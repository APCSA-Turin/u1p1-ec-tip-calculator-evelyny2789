package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
               
                    //WRITE YOUR PROGRAM IN calculateTip
                
                       
                        double tip = (percent/100.0) * cost;
                        double billTip = cost + tip; 
                        double beforeTip = cost/people; 
                        double tipPerson = tip/people; 
                        double totalCost = billTip/people; 
                        
                        
                        result.append("-------------------------------\n");
                        result.append("Total bill before tip: $" + (Math.round(cost * 100.0) / 100.0) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
                        result.append("Total percentage: " + percent + "%\n");
                        result.append("Total tip: $" + (Math.round(tip * 100.0) / 100.0) + "\n");        // I learned how to round from here: https://www.educative.io/answers/how-to-use-the-java-mathround-method
                        result.append("Total Bill with tip: $" + (Math.round(billTip * 100.0) / 100.0) + "\n");
                        result.append("Per person cost before tip: $" + (Math.round(beforeTip * 100.0) / 100.0) + "\n");
                        result.append("Tip per person: $" + (Math.round(tipPerson * 100.0) / 100.0) + "\n");
                        result.append("Total cost per person: $" + (Math.round(totalCost * 100.0) / 100.0) + "\n");
                        result.append("-------------------------------\n");
                        result.append("Items ordered:\n");
                        result.append(items);
                

                        return result.toString();
                        

                    }
                
                   
                        
                    

                        
                
        //the two lines  should go below result.append("-------------------------------\n"); 
    
    
                                   
    public static void main(String[] args) {
        int people = 0;
        int percent = 0;
        double cost = 0.0;
        String items = ""; 

         
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter items ordered or enter -1 when done");
        String itemName = scan.nextLine(); 
        while (!itemName.equals("-1")) {
            items += itemName; 
            items +="\n";
            System.out.print("Enter items ordered or enter -1 when done");
            itemName = scan.nextLine(); 
            
        }

        
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
