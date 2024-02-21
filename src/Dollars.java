public class Dollars extends Money{

    public Dollars(double money) {
        super(money);
    }

    @Override
    void exchangeToDollar() {
    }

    @Override
    void exchangeToTenge() {
        double tenge = money * 450;
        System.out.println(tenge);
    }

    @Override
    void exchangeToRubles() {
        double rubles = money * 92;
        System.out.println(rubles);
    }

    @Override
    void exchangeToEuro() {
        double euros = money * 0.93;
        System.out.println(euros);
    }
}
