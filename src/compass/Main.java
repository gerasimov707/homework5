package compass;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //задание 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[2]);
        System.out.print("\n");
        double[] b = new double[3];
        b[0] = 1.57;
        b[1] = 7.654;
        b[2] = 9.986;
        System.out.print(b[0] + ",");
        System.out.print(b[1] + ",");
        System.out.print(b[2]);
        System.out.print("\n");
        int[] mass = {2, 5, 77};
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1)
                System.out.println(mass[i]);
            else
                System.out.print(mass[i] + ",");
        }
        //задание 2
        int[] a1 = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[2] + "   ");
        double[] b1 = new double[3];
        b[0] = 1.57;
        b[1] = 7.654;
        b[2] = 9.986;
        System.out.print(b[0] + ",");
        System.out.print(b[1] + ",");
        System.out.print(b[2] + "   ");
        int[] mass1 = {2, 5, 77};
        for (int u = 0; u < mass.length; u++) {
            if (u == mass.length - 1)
                System.out.println(mass[u]);
            else
                System.out.print(mass[u] + ",");
        }

            }
        }













