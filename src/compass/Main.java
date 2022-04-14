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
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        System.out.print(a[0] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[2] + "   ");
        double[] b1 = new double[3];
        b1[0] = 1.57;
        b1[1] = 7.654;
        b1[2] = 9.986;
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


        int[] one = {1, 2, 3};
        for (int i = one.length - 1; i >= 0; i--) {
            if (i > one.length - 1) {
                System.out.print(one[i]);
            } else {
                System.out.print(one[i] + ", ");
            }
        }
        System.out.print("\n");
        double[] i3 = {1.57, 7.654, 9.986};
        for (int i = b.length - 1; i >= 0; i--) {
            if (i > b.length - 1) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.print("\n");
        int[] i1 = {2, 5, 77};
        for (int i = a.length - 1; i >= 0; i--) {
            if (i > a.length - 1) {
                System.out.print(a[i]);
            } else
                System.out.print(a[i] + ", ");
        }
        System.out.print("\n");
        int[] arr1 = new int[]{1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            switch (arr1[i] % 2) {
                case 0:
                    System.out.print(arr1[i]);
                    break;
                case 1:
                    System.out.print(++arr1[i]);
                    break;
            }
            if (i != arr1.length - 1) System.out.print(", ");
        }
    }
}














