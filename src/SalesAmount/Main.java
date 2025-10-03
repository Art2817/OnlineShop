package SalesAmount;

public class Main
{
    public static void main(String[] args)
    {
        String template = """ 
            Product No %d: %s,
            total sales for %d days is EUR %s,
            sales by day is EUR %s.
            """;

        int smartphoneQty = 39;
        double smartphonePrice = 305.99;
        int smartphoneDays = 5;

        String output1 = template.formatted(1, "smartphone", smartphoneDays,
                String.format("%,.2f", smartphoneQty * smartphonePrice),
                String.format("%,.2f", (smartphoneQty * smartphonePrice) / smartphoneDays)
        );

        // Laptop
        int laptopQty = 18;
        double laptopPrice = 570.95;
        int laptopDays = 7;

        String output2 = template.formatted(2, "laptop", laptopDays,
                String.format("%,.2f", laptopQty * laptopPrice),
                String.format("%,.2f", (laptopQty * laptopPrice) / laptopDays)
        );

        System.out.println(output1);
        System.out.println(output2);
    }
}
