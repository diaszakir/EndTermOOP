public class Euros extends Money{

    public Euros(double money) {
        super(money);
    }

    @Override
    void exchangeToDollar() {
        double dollars = money / 0.93;
        System.out.println(dollars);
    }

    @Override
    void exchangeToTenge() {
        double tenge = money * 480.0;
        System.out.println(tenge);
    }

    @Override
    void exchangeToRubles() {
        double rubles = money / 99.0;
        System.out.println(rubles);
    }

    @Override
    void exchangeToEuro() {
    }
}
