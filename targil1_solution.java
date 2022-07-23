import java.util.Scanner;

public class targil1_solution {
    public static void main(String[] args) {


        //solution 1//
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("please enter int a");
        int a = num1.nextInt();
        System.out.println("please enter int b");
        int b = num2.nextInt();

        boolean t1 = a > b;
        boolean t2 = a < b;
        boolean t3 = a == b;

        if (t1) {
            System.out.println(a + ">" + b);
        }

        if (t2) {
            System.out.println(a + "<" + b);
        }
        if (t3) {
            System.out.println(a + "=" + b);
        }

    }
    }

