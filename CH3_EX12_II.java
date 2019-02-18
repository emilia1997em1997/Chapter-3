import java.util.Scanner;
public class CH3_EX12_II {
    public static void main(String[] args) {
        CH3_EX12 INVOICE = new CH3_EX12();

        Scanner input = new Scanner (System.in);

        String item;
        String description;
        int quantity;
        double price;

        System.out.print ("Enter number: ");
        item = input.nextLine();
        INVOICE.setPartNumber(item);

        System.out.print ("Enter description of item purchased: ");
        description = input.nextLine();
        INVOICE.setPartDescription(description);

        System.out.print ("Enter the quantity of item purchased: ");
        quantity = input.nextInt();
        if (quantity > 0)
            INVOICE.setQuantityofItemPurshed(quantity);

        System.out.print ("Enter the price per item: ");
        price = input.nextDouble();
        if (price > 0)
            INVOICE.setPriceperItem (price);

        System.out.printf ("The total amount for all items purchased = $%.2f\n",
                INVOICE.getInvoiceAmount());

    }
}

