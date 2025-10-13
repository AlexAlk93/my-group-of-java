import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceti suma de plata: ");
        double sumaIntrodusa = scan.nextDouble();

        System.out.println("Alegeti metoda de plata:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Crypto");

        int alegere = scan.nextInt();  // are de ales din cifrele 1,2,3
        // Cristiana:
        // aici ar trebui sa fie un switch....

        // Alex adauga un sout cu Tranzactia efectuata + ultimele detalii
       switch (alegere) {
           case 1:
               System.out.println("Cash");
               break;
           case 2:
               System.out.println("Card");
               break;
           case 3:
               System.out.println("Crypto");
               break;
       }


    }
}
