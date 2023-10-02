using System;

namespace real{
class Grocery
{
    public string name;
    public int quantity;
    public double pricePerUnit;

    // Constructor to initialize the properties
    public Grocery(string name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double CalculateTotalCost()
    {
        return Quantity * PricePerUnit;
    }
}

class Program
{
    static void Main()
    {
        // Create two grocery items using constructors
        Grocery item1 = new Grocery("Apples", 3, 50);
        Grocery item2 = new Grocery("Milk", 2, 60);

        // Calculate and display the total cost for each item
        Console.WriteLine("Total cost  of item 1" + item1.CalculateTotalCost());
                Console.WriteLine("Total cost  of item 2" + item2.CalculateTotalCost());

        

        // Calculate and display the overall total shopping cost
        double totalShoppingCost = item1.CalculateTotalCost() + item2.CalculateTotalCost();
        Console.WriteLine("Overall total shopping cost: $" + totalShoppingCost);
    }
}
}
