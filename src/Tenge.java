public class Tenge extends Money{
    public Tenge(double money) {
        super(money);
    }

    @Override
    void exchangeToDollar() {
        double dollar = money / 450;
        System.out.println(dollar);
    }

    @Override
    void exchangeToTenge() {
    }

    @Override
    void exchangeToRubles() {
        double rubles = money / 5.0;
        System.out.println(rubles);
    }

    @Override
    void exchangeToEuro() {
        double euros = money / 480.0;
        System.out.println(euros);
    }
}
