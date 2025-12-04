package library.project;


public class Book extends LibraryItem{
    
    private String description;

    public Book(String title, String description, double price) {
        
        super(title , price);
        this.description = description;   
    
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    public boolean isAvailable(){
        return this.isAvailable;
    }
    
    public void purchaseBook(){
        this.isAvailable = false;
    }

    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nPrice: " + price + " SAR";
    }

   

   

   
    
}

    


