public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Bram", "Engel", new VisaCard(50));
        Customer customer2 = new Customer("Melati", "Spruit", new MasterCard(50));

        customer.getCreditCard().pay(10);
        customer2.getCreditCard().pay(10);
        customer.printNameAndCreditcardDebt();
        customer2.printNameAndCreditcardDebt();
    }
}
