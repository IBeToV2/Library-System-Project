package library.project;


public class Customer {
    private String name;
    private double totalCost;

    public Customer(String name) {
        this.name = name;
        this.totalCost = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addToTotal(double price) {
        totalCost += price;
    }

    public void applyDiscount() {
        if (totalCost >= 50) {
            totalCost = totalCost * 0.9; 
        }
    }

    public String toString() {
        return "Customer Name: " + name + "\nTotal Cost: " + totalCost + " SAR";
    }
}
    

