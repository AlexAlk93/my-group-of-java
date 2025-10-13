public class CardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Plata card" + amount);
    }
}
