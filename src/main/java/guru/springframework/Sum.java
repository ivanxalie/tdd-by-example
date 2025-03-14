package guru.springframework;

public class Sum implements Expression {
    final Expression augment;
    final Expression addend;

    public Sum(Expression augment, Expression addend) {
        this.augment = augment;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = addend.reduce(bank, to).amount + augment.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augment.times(multiplier), addend.times(multiplier));
    }
}
