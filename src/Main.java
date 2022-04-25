public class Main {
    public static void main(String[] args) {
        int balance = 900;
        int payment = 1600;

        int bonus = payment > 1000 ? payment / 100 : 0;
        balance +=  bonus + payment;

        System.out.println("Ваш баланс " + balance);
        System.out.println("Пополнен счет на " + payment);
        System.out.println("Начислено " + bonus + " бонусных рублей");
    }
}