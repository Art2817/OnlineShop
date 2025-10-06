package Tax;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = input.nextDouble();
        double tax;

        if (income <= 10000)
        {
            tax = income * 0.025;
        }
        else if (income <= 25000)
        {
            tax = income * 0.043;
        }
        else
        {
            tax = income * 0.067;
        }

        System.out.printf("Tax amount: %.2f USD%n", tax);

    }
}
