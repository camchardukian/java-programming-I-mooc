
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {
        int listLength = strings.size();
        if (listLength == 0) {
            return;
        }
        strings.remove(listLength - 1);
    }
}
