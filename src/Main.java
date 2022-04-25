public class Main {
    public static void main(String[] args) {
        int balance = 900;
        int payment = 1600;
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
            balance = balance + bonus + payment;
        } else {
            balance = balance + payment;
        }
        System.out.println("Ваш баланс " + balance);
        System.out.println("Пополнен счет на " + payment);
        System.out.println("Начислено " + bonus + " бонусных рублей");
    }
}