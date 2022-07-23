import java.util.Scanner;

public class targil1_solution {
    public static void main(String[] args) {
        //seif1();
        //seif2();
        //seif3();
        //seif4();
        seif5();
    }

    public static void seif1() {
        //solution 1//
        Scanner numInput = new Scanner(System.in);
        System.out.println("please enter int a");
        int a = numInput.nextInt();
        System.out.println("please enter int b");
        int b = numInput.nextInt();

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
     public static void seif2() {

        int x = 5;
        while (x < 11){
            System.out.println(x);
            x = x + 1;
        }
     }
    public static void seif3(){

        Scanner numInput = new Scanner(System.in);
        System.out.println("please enter int a");
        int a = numInput.nextInt();

         while (a <= 100){
            System.out.println(a);
             System.out.println("please enter int a");
             a = numInput.nextInt();
        }

    }

    public static void seif4(){

       //while solution
        int x = 4;
        while (x < 101){System.out.println(x);
            x = x + 2;
        }

        //for solution
        for (int i =4; i < 101; i = i + 2){
            System.out.println(i);
        }

    }

    public static void seif5(){
        int a,b;
        do {
            Scanner numInput = new Scanner(System.in);
            System.out.println("please enter int a");
            a = numInput.nextInt();
            System.out.println("please enter int b");
            b = numInput.nextInt();

            System.out.println("enter equals numbers");
        }
        // while (a != b;) {
        while (!(a == b)) ;

        }
}

