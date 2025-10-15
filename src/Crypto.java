public class Crypto implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Plata crypto" + amount);
    }
}
