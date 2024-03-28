public class VisaCard extends CreditCard{
    public VisaCard(int debt) {
        super(debt);
    }

    @Override /* override the Superclass equivalent pay() method*/
    void pay(int amount) {
        super.pay((int)(amount * 0.9)); /*  "type casting" or "explicit type conversion"  */
    }
}
