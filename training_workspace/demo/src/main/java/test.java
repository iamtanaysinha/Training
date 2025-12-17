import java.util.*;

public class test {
    public static void main(String[] args) {
        List<String> browsers = new ArrayList<>();
        browsers.add("chrome");
        browsers.add("firefox");
        browsers.add("chrome");

        for (String browser : browsers) {
            System.out.print(browser);
        }

    }

}
