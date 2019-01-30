import java.util.Scanner;

public class CustomerPurchase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String customerName = scanner.nextLine();

        System.out.println("What purchase did you make?");
        String purchaseType = scanner.nextLine();

        System.out.println("How much did you pay for it?");
        int purchaseAmount = scanner.nextInt();

        Double salesTax1 = 0.03;
        Double salesTax2 = 0.05;
        Double salesTax3 = 0.07;
        Double salesTax4 = 0.09;

        if (purchaseAmount <= 50) {
            System.out.println("Purchase type: " + purchaseType);
            System.out.println("Purchased for: " + purchaseAmount);
            System.out.println("Tax amount: " + (purchaseAmount * salesTax1));
            System.out.println(customerName + " has bought " + purchaseType + " for " + purchaseAmount +
                    " and has paid a sales tax of " + ((purchaseAmount * salesTax1) + " and your total is " +
                    (purchaseAmount + (((purchaseAmount * salesTax1))))));
        } else if (purchaseAmount > 50 && purchaseAmount <= 100) {
            System.out.println("Purchase type: " + purchaseType);
            System.out.println("Purchased for: " + purchaseAmount);
            System.out.println("Tax amount: " + (purchaseAmount * salesTax2));
            System.out.println(customerName + " has bought " + purchaseType + " for " + purchaseAmount +
                    " dollars" + " and has paid a sales tax of " + ((purchaseAmount * salesTax2) + " and your total is " +
                    (purchaseAmount + (((purchaseAmount * salesTax2))))));
        } else if (purchaseAmount > 100 && purchaseAmount <= 150) {
            System.out.println(customerName + " has bought " + purchaseType + " for " + purchaseAmount +
                    " and has paid a sales tax of " + ((purchaseAmount * salesTax3) + " and your total is " +
                    (purchaseAmount + (((purchaseAmount * salesTax3))))));
        } else if (purchaseAmount > 150 && purchaseAmount <= 200) {
            System.out.println(customerName + " has bought " + purchaseType + " for " + purchaseAmount +
                    " and has paid a sales tax of " + ((purchaseAmount * salesTax4) + "and your total will be " +
                    ( purchaseAmount + ((purchaseAmount * salesTax4)))));
        } else {
            System.out.println("This is a high value item, therefore will be taxed more");
            System.out.println(customerName + ", you have bought " + purchaseType + " for " + purchaseAmount +
                    " and will pay a sales tax of " + ((purchaseAmount * 0.1) + " and your total will be " + (
                    purchaseAmount + (((purchaseAmount * 0.1))))));
        }


    }

}
