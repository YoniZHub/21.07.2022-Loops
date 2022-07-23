import java.util.Scanner;

public class targil2_solution {

    public static void main(String[] args) {
        seif1();
        //seif2();
        //seif3();
        //seif4();
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


}