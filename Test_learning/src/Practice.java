/*
import com.sun.deploy.security.SelectableSecurityManager;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
*/
/*public class Practice {*//*

    */
/*    public static void main(String[] args) {
            int a;
            long b = 1;
            Scanner sca = new Scanner(System.in);
            System.out.println("Please,enter number");
            if (sca.hasNextInt()) {
                a = sca.nextInt();
                for (int i = a; i > 0; i--) {
                    b *= i;
                }
                System.out.println("Факториал числа " + a + " равен " + b);
            }
            else System.out.println("Ошибка. Введено не число");
        }*//*

*/
/*public static void main(String[] args) {
    int i =2;
do {
    System.out.println(i);
    i*=2;
}while (i<=1024);
}*//*

*/
/*public static void main(String[] args) {
    for (int i = -50;i<=50;i=i+2)
    System.out.println(i);
}*//*

*/
/*public static void main(String[] args) {
    int count =0;
    for (int i = 0; i <= 5000; i++) {
        if (i % 5 == 0 || i % 10 == 0) {
            count++;
            System.out.println("satisfied condition =" + i);
        }
        System.out.println("i has value =" + count);
    }
}*//*

*/
/*public static void main(String[] args) {
    int count = 0;
    for (int i = -20;i <20;i++){
        if (i % 10 ==0){
            count++;
            System.out.println(count);
        }
    }
}*//*

*/
/*
    public static void main(String[] args) {
        int a = 21;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Количество делителей - " + count);
    }
}*//*

*/
/*    public static void main(String[] args) {
        int a =0;
        for (int i =0;i<=100;i++){
            if (i!=100)
                i=a;
                System.out.println(a);
                a++;
        }
    }*//*

 */
/*   public static void main(String[] args) {
        Scanner scm = new Scanner(System.in);
        System.out.println("Enter number of the month:");
        int m = scm.nextInt();
                    switch (m){
                case 1: case 2: case 12 :
                    System.out.println( "Right now is  a winter" + m);
                    break;
                case 3: case 4: case 5:
                    System.out.println("Right now is a spring" + m);
                    break;
                case 6: case 7: case 8:
                    System.out.println("Right now is a summer" + m);
                    break;
                case 9: case 10: case 11:
                    System.out.println("Right now is a autumn" + m);
                    break;
                default:
                    System.out.println("Unexpected number" + m);
            }
            }
*//*

    */
/*public static void main(String[] args) {
        System.out.println(Math.toDegrees(Math.cos(60)));
        System.out.println(Math.toDegrees(Math.cos(45)));
        System.out.println(Math.toDegrees(Math.cos(40)));
    }*//*

  */
/*  public static void main(String[] args) {
        double a = 10;
        double b = 34;
        double c = Math.sqrt(a*a+b*b);
        double s = (a*b)/2;
        System.out.println("This is PLOSHAD " + s);
        double p = a+b+c;
        System.out.println("This is PERiMETR " + p);
            }*//*

*/
/*    public static void main(String[] args) {
        int n = 123456789;
        double num;
        int c = (int)(Math.ceil(Math.log10(n))+ 0.000000000000001);
        System.out.println(c);
    }*//*

   */
/* public static void main(String[] args) {
        int a =8;
        int b = 0;
        int c = -3;i
        double sig_a = Math.signum(a);
        double sig_b = Math.signum(b);
        double sig_c = Math.signum(c);
        System.out.println(sig_a);
        System.out.println(sig_b);
        System.out.println(sig_c);
    }*//*

    */
/*public static void main(String[] args) {*//*

      */
/*  int a = (int) (Math.random() * 6 - 3);
                System.out.println(a);
        }*//*

  */
/*      int n = 7;
        int a = (int) (Math.random() * (2*n +1) - n);
        System.out.println(a);
        System.out.println(n);
    }*//*

*/
/*            int a = 0;
            for (int i = 2;i<=20;i++){
                if (i%2==0)a++;
                }
        int[] mas1 = new int [a];
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + " ");
            if (i == 20) {
                System.out.println();
            }s
        }

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }*//*

       */
/* int a = 0;                          //NEEED CLARIFICATION
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                a++;
        }
        int[] mas2 = new int[a];
        System.out.println(mas2.length);
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                mas2[b] = i;
                System.out.println(mas2[b] + " ");
                b++;
            }
        }
        System.out.println("\n");
        for (int i = mas2.length - 1; i >= 0; i--) {
            System.out.println(mas2[i] + " ");      //подумать здесь нужно
         }*//*

*/
/*        int[] j = new int[50];            //Simple but not like it

        for (int a = 1, b = 0; a <= 99; a+=2, b++)
        {
            j[b] = a;
        }

        // вывод массива
        for (int i = 0; i < 50; i++)
        {
            System.out.print(j[i] + " ");
        }

        System.out.print("\n"); // на новую строку

        // вывод в обратном порядке
        for (int i = 49; i >= 0; i--)
        {
            System.out.print(j[i] + " ");
        }*//*

  */
/*      int [] mas3 = new int[15];
        int b = 0;
        for (int i = 0;i<mas3.length;i++){
            mas3[i] = ((int) (Math.random()*9));
        }
        for (int i = 0;i<mas3.length;i++){
            if (mas3[i]%2==0 && (mas3[i] != 0)){
                b++;
            }
            System.out.println(mas3[b] + " ");
        }
        System.out.println();
        System.out.println("Sum of elements " + b);
    }
    }*//*


}/*/
