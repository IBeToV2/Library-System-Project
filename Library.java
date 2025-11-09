package library.project;


public class Library {
    
    private Book[] books;
    
    public Library(){
        this.books = new Book[5];
        
        this.books[0] = new Book("Object Oriented Programming" ," Learn the fundamentals of OOP, including classes, objects, and inheritance. " , 67.00);
        this.books[1] = new Book("Introduction To Networking" , " Covers the basics of network models, protocols, and data communication. " , 32.00);
        this.books[2] = new Book("Information Security Management" ," Strategies for managing and protecting organizational information assets. " , 71.50 );
        this.books[3] = new Book("Algorithm Analysis" , " A guide to analyzing the efficiency and performance of algorithms." , 55.00);
        this.books[4] = new Book("Data Structures" , " Explores essential data structures like arrays, lists, and trees. " , 49.90);

        
    }
    
    public void displayBooks(){
        System.out.println("Welcome To Our Library System ! ");
        System.out.println("Designed By : Khalid Bubshait , Faris Alsaed , Hassan Al saeed , Rakan Almulhim , Adittian ");
        System.out.println("============================================================================================= ");
        System.out.println("Available Books : ");
        
        for (int i = 0 ; i < books.length ; i++){
            
              if(books[i].isAvailable()){

            System.out.println((i + 1) + " . " + books[i].getTitle() + " - " + books[i].getDescription() + " - " +  books[i].getPrice() + " SAR");
              }
              else{
                  System.out.println(books[i].getTitle() + "[SOLD OUT] ");
              }
        }
        
      
        
    }
    public Book getBook(int index){
        if(index >= 0 && index < books.length){
            return books[index];
        }
        return null;
    }
    
    public int getBookCount(){
        return books.length;
    }
    
    
    
}

