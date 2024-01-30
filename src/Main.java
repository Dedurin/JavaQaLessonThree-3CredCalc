public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double annualInterest = 9.99;
        int months = 24;
        double payment = service.calculate(amount, annualInterest, months);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}