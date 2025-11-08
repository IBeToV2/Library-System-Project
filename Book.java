package library.project;


public class Book {
    
     private String title;
    private String description;
    private double price;
    private boolean isAvailable;

    public Book(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.isAvailable = true;
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

    

