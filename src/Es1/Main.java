package Es1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[5];

        for (int i= 0 ; i< array.length; i++){
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array random");
        printArr(array);

        while (true){
            System.out.println("Insert number - Press 0 to exit");
            int number = scanner.nextInt();
            if ( number == 0){
                break;
            }

            if (number < 0 || number > 100) {
                System.out.println("Invalid number. Insert numbers between 1 and 100.");
                continue;
            }
            System.out.println("Insert position (from 0 to 4)");
            int position = scanner.nextInt();

            if (position < 0 || position >= array.length){
                System.out.println("Bad position. Enter numbers from 0 to 4") ;
                continue;
            }

            System.out.println("Array modificato");
            printArr(array);
        }

        System.out.println("End");
        scanner.close();

    }
    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
