package Array;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(201) - 100;
        }

        System.out.print("Елементи масиву: [");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }

        System.out.println("]");


        int nSum = 0;
        for (int num : arr)
        {
            if (num < 0)
            {
                nSum += num;
            }
        }
        System.out.println("\nСума від'ємних чисел: " + nSum);


        int even = 0, odd = 0;
        for (int num : arr)
        {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Кількість парних чисел: " + even);
        System.out.println("Кількість непарних чисел: " + odd);


        int min = arr[0], max = arr[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("\nНайменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");


        int negIndex = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                negIndex = i;
                break;
            }
        }

        if (negIndex == -1 || negIndex == arr.length - 1)
        {
            System.out.println("\nВ масиві немає від'ємних чисел або вони стоять в кінці.");
        }
        else
        {
            double sum = 0;
            int count = 0;
            for (int i = negIndex + 1; i < arr.length; i++)
            {
                sum += arr[i];
                count++;
            }
            double avg = sum / count;
            System.out.printf("\nСереднє арифметичне чисел після першого від'ємного числа: %.2f%n", avg);
        }
    }
}
