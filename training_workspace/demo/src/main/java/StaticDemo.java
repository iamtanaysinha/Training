import java.util.Random;

public class StaticDemo {

    public static void main(String[] args) {

        Random randomno = new Random();
        int cnt = 0;
        for (int i = 0; i <= randomno.nextInt(10); i++) {
            new Boy();
            new Girl();
            System.out.println(cnt++);
        }

        // check next int value
        // System.out.println("Next int value: " + randomno.nextInt());

        // Human h1 = new Human();
        // h1.identify();

        // Boy b1 = new Boy();
        // b1.identify();

        // Girl g1 = new Girl();
        // g1.identify();

        // Robot r1 = new Robot();
        // r1.identify();

        System.out.println("Total Human Population = " + Human.population);
        // System.out.println("Total Human Population = " + randomno.nextInt(10));
    }
}
