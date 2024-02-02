public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
Create a class Product that represents a store product. 
The product should have a price (double), 
a quantity (int) and a name (String).

The class should have:

the constructor public Product (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
Sample output
Banana, price 1.1, 13 pcs