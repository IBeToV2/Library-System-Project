
package library.project;

import java.util.Scanner;


public class LibraryProject {

  
    public static void main(String[] args) {
        
        int continueChoice;
        
        Scanner input = new Scanner(System.in);
        Library library =new Library();
        Customer customer =new Customer("Khalid");
        
        library.displayBooks();
        
        do {
            int BookChoice = -1;
            
            while(true){
                System.out.println("\nEnter the number of the book you want to purchase (1-" + library.getBookCount() + "): ");
                
                if(input.hasNextInt()){
                    BookChoice = input.nextInt();
                    
                    if(BookChoice >= 1 && BookChoice <= library.getBookCount()){
                        break;
                    }
                    else{
                        System.out.println("Error : invalid choice , PLease Enter a number between 1 and " + library.getBookCount());
                    }
                   
                }
                else{
                    System.out.println("Invalid input , Please Enter a number ");
                }
                
            }
            
            int index = BookChoice - 1;
            
            Book selectedBook = library.getBook(index);
            
            if(selectedBook.isAvailable()){
                
                selectedBook.purchaseBook();
                
            double price = selectedBook.getPrice();
            customer.addToTotal(price);
            
            System.out.println("Book '" + selectedBook.getTitle() + "' added. Your current total is: " + String.format("%.2f", customer.getTotalCost()) + " SAR");
            }
            
            else{
                System.out.println("Sorry , The Book '" + selectedBook.getTitle() + "' is already [SOLD OUT] , please Choose another one ");
            }
            
            
            while(true){
                System.out.println("\nDo you wish to buy another book? (Enter 1 for Yes , 0 for No): ");
                if(input.hasNextInt()){
                    continueChoice = input.nextInt();
                    
                    if(continueChoice == 0 || continueChoice == 1){
                        break;
                    } 
                    else{
                        System.out.println("Error : invalid Choice , please Enter 0 or 1. ");
                    }

                }
                else{
                    System.out.println("Error : invalid input , Please enter a number ");
                }
            }
                

            }while(continueChoice == 1);
        
        
        System.out.println("==== Final Bill ====");
        
        double originalTotal = customer.getTotalCost();
        customer.applyDiscount();
        
        double finalTotal = customer.getTotalCost();
        
        System.out.printf("Total before discount : %.2f SAR\n" , originalTotal);
        
        if(originalTotal != finalTotal){
            double discount = originalTotal - finalTotal;
            System.out.printf("A 10%% discount of %.2f SAR was applied (Total >= 50 SAR).\n " , discount);
        }
        else{
            System.out.println("No discout applied (Total was less than 50 SAR) ");
        }
        
        
        System.out.printf("Final Cost : %.2f SAR\n" , finalTotal);
        System.out.println("Thank You for using our Library System , We Hope You are Satisfied with us (: !");
           
            

    }
    
}

//test
