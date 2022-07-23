import java.util.Scanner;

public class targil2_solution {

    public static void main(String[] args) {
        //seif1();
        //seif2();
        //seif3_1();
        //seif3_2();
        seif4();
    }

    public static void seif1() {

        int x = -1000;
        do {
            System.out.println(x);
            x = x + 1;

        }
        while (x < 1001);
    }

    public static void seif2() {

        Scanner userInput = new Scanner(System.in);
        int oreh, rohav, hekef;

        do {
            System.out.println("hekef = (oreh + rohav) * 2");
            System.out.println("please enter oreh");
            oreh = userInput.nextInt();
            System.out.println("please enter rohav");
            rohav = userInput.nextInt();
            System.out.println("please enter hekef");
            hekef = userInput.nextInt();

        }
        while (!(oreh * 2 + rohav * 2 == hekef));
        System.out.println("good work");


    }

    public static void seif3_1() {
        int x = -1000;
        while (true) {
            System.out.println(x);

            if (x == 1000) {
                break;
            }
            x++;


        }

    }
    public static void seif3_2 () {
        Scanner userInput = new Scanner(System.in);
        int oreh, rohav, hekef;
        while (true) {
            System.out.println("hekef = (oreh + rohav) * 2");
            System.out.println("please enter oreh");
            oreh = userInput.nextInt();
            System.out.println("please enter rohav");
            rohav = userInput.nextInt();
            System.out.println("please enter hekef");
            hekef = userInput.nextInt();


            if (hekef == oreh * 2 + rohav * 2) {
                break;
            }
        }

    }

    public static void seif4() {
        Scanner uaweInput = new Scanner(System.in);

        float temperature;

        while (true) {
            temperature = uaweInput.nextFloat();

            if (temperature < 35 || temperature > 42) {
                System.out.println("out of range");
                break;
            }
            if (temperature >= 35 && temperature <= 37.5)
            {
                System.out.println("healthy");
                break;
            }

            if(temperature > 37.5 && temperature <=42)
            {
                System.out.println("sick");
            }
        }
    }

}