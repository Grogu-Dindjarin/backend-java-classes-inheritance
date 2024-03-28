public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Bram", "Engel", new VisaCard(50));
        Customer customer2 = new Customer("Melati", "Spruit", new MasterCard(50));

        customer.printName();
        customer2.printName();
        customer.getCreditCard().pay(10);
        customer.getCreditCard().pay(10);
        System.out.println(customer.getCreditCard().getDebt());
        System.out.println(customer2.getCreditCard().getDebt());
    }
}
