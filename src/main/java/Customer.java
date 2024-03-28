public class Customer {
    public String name;
    public String lastName;
    public int customerNumber;

    private CreditCard creditCard;


    public Customer(String name, String lastName, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void printName() {
        System.out.println("Customer " + this.name);
    }

    public void printNameAndCreditcardDebt() {
        System.out.println("Customer " +
                this.name +
                ", creditcard debt: " +
                this.getCreditCard().getDebt());
    }
}
