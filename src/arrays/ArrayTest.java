package arrays;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = text.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor da posição " + i + "° do array: ");
            arr[i] = text.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Valor da posição " + i + " do array: ");
            System.out.println(arr[i]);
        }

        text.close();
    }

}
