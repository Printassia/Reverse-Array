package Horsy.com.company.Ch07;

/*
The program reads numbers from an array. Then displays the numbers in reverse order.
 */

public class ReverseArrayII {
    public static void main(String[] args){
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("Original Array: ");
        for (int p = 0; p < array.length; p++)
            System.out.print(array[p] + " ");

        System.out.println();

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
