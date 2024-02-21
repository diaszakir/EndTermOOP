public class Rubles extends Money{
    public Rubles(double money) {
        super(money);
    }

    @Override
    void exchangeToDollar() {
        double dollar = money / 92;
        System.out.println(dollar);
    }

    @Override
    void exchangeToTenge() {
        double tenge = money * 5;
        System.out.println(tenge);
    }

    @Override
    void exchangeToRubles() {
    }

    @Override
    void exchangeToEuro() {
        double euros = money / 99;
        System.out.println(euros);
    }
}
