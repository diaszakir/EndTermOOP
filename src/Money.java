public abstract class Money {
    protected double money;

    public Money(double money) {
        this.money = money;
    }

    abstract void exchangeToDollar();
    abstract void exchangeToTenge();
    abstract void exchangeToRubles();
    abstract void exchangeToEuro();
}
