public class CashPayment implements Payment{


    @Override
    public void pay(double amount) {
        System.out.println("Plata cash" + amount);
    }

}
