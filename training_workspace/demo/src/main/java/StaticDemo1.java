import java.util.Random;

public class StaticDemo1 {

    public static void main(String[] args) {

        Random randomno = new Random();
        int limit = randomno.nextInt(10);

        for (int i = 0; i <= limit; i++) {
            new Boy();
            new Girl();
        }

        System.out.println("Total Human Population = " + Human.population);
    }
}

