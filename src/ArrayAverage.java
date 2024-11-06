// Module 7 Excercise 7.8 
// By Addison Roy 

// Imports 
import java.util.Scanner;

public class ArrayAverage {


    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubleArray = new double[10];

        System.out.println("Average an array program");
        System.out.println("Enter ten double value numbers: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = scanner.nextDouble();
        }


        double avg = average(doubleArray);
        System.out.println("The average value of the ten numbers is: " + avg);
    }
}
