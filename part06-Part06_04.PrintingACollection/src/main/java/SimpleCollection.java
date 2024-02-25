
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int listLength = elements.size();
        String elementsContent = "";
        if (listLength == 0) {
            return "The collection " + this.name + " is empty.";
        }
        for (String element : elements) {
            elementsContent = elementsContent + "\n" + element;
        }
        return "The collection " + this.name + " has " + listLength + (listLength > 1 ? " elements:" : " element:")
                + elementsContent;
    }

}
