public class CreditPaymentService {
    public double calculate(double amount, double annualInterest, int months) {
        double monthlyInterest = annualInterest / 12 / 100;
        double payment = monthlyInterest * amount / (1 - Math.pow(1 + monthlyInterest, -months));
        return payment;
    }
}
