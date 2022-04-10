package compass;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        for (int i = one.length - 1; i >= 0; i--) {
            if (i > one.length - 1) {
                System.out.print(one[i]);
            } else {
                System.out.print(one[i] + ", ");
            }
        }
        System.out.print("\n");
        double[] b = {1.57, 7.654, 9.986};
        for (int i = b.length - 1; i >= 0; i--) {
            if (i > b.length - 1) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.print("\n");
        int[] a = {2, 5, 77};
        for (int i1 = a.length - 1; i1 >= 0; i1--) {
            if (i1 > a.length - 1) {
                System.out.print(a[i1]);
            } else
                System.out.print(a[i1] + ", ");
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













