import java.util.Map;
import java.util.HashMap;

public class ColoursMap {
    public static void main(String[] args) {

        Map<Integer, String> colours = new HashMap<>();

        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Pink");

        System.out.println("Colours Map: " + colours);

        colours.remove(4); 
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does Green exist? " + hasGreen);
        System.out.println("Size of the Map: " + colours.size());
    }
}
