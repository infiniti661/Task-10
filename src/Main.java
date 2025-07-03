public class Main {
    public static void main(String[] args) {
        SimpleAccount simple = new SimpleAccount(5000);
        CreditAccount credit = new CreditAccount(10000);

        System.out.println(simple.pay(3000));    // true
        System.out.println(simple.getBalance()); // 2000

        System.out.println(credit.pay(5000));    // true
        System.out.println(credit.getBalance()); // -5000

        System.out.println(simple.transfer(credit, 1500)); // true
        System.out.println(simple.getBalance()); // 500
        System.out.println(credit.getBalance()); // -3500
    }
}