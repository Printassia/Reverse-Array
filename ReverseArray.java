package Horsy.com.company.Ch07;

import java.util.Scanner;

/*
The program allows the user to input as many numbers they like. Then displays
the numbers in reverse order.
 */

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to to display in reverse: ");
        int[] array = new int[input.nextInt()];

        System.out.println("Input the numbers and press Enter after each number. ");
        for (int arrayLoop = 0, counter = 1;
             arrayLoop < array.length; arrayLoop++){
            System.out.print("Original Array Input " + counter++ + ": ");
            array[arrayLoop] = input.nextInt();
        }

        reverse(array);
        System.out.print("Reversed Array: ");
        for (int a = 0; a < array.length; a++)
            System.out.print(array[a] + " ");
    }

    public static void reverse(int array[]){
        for (int i = 0, j = array.length - 1;
             i <= j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
