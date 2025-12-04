package library.project;


public abstract class LibraryItem implements Purchasable {
    
    protected String title;
    protected double price;
    protected boolean isAvailable;
    
    public LibraryItem(String title , double price){
        this.title = title;
        this.price = price;
        this.isAvailable = true;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    
}
