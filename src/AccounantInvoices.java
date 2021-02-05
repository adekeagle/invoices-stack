import java.math.BigDecimal;
import java.util.Scanner;

public class AccounantInvoices {
    public static void main(String[] args) {

        InvoiceStack invoiceStack = new InvoiceStack();
        Scanner scanner = new Scanner(System.in);

        int option;

        do{
            System.out.println("1 - is empty");
            System.out.println("2 - top invoice");
            System.out.println("3 - push invoice");
            System.out.println("4 - pop invoice");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine();
            Invoice invoice;
            switch (option){
                case 1:
                    System.out.println(invoiceStack.isEmpty());
                    break;
                case 2:
                    System.out.println(invoiceStack.top());
                    break;
                case 3:

                    System.out.println("No Invoice: ");
                    String name = scanner.nextLine();

                    System.out.println("Total value: ");
                    BigDecimal total = scanner.nextBigDecimal();

                    invoice = new Invoice(name, total);
                    invoiceStack.push(invoice);
                    break;
                case 4:
                    invoiceStack.pop();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Something goes wrong!!!");
            }

        }while (option != 0);

    }
}
