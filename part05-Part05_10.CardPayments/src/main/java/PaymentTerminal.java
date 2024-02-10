
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals
    private static final double costOfAffordableMeal = 2.5;
    private static final double costOfHeartyMeal = 4.3;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment < costOfAffordableMeal) {
            return payment;
        }
        money = money + costOfAffordableMeal;
        affordableMeals++;
        return payment - costOfAffordableMeal;

    }

    public double eatHeartily(double payment) {
        if (payment < costOfHeartyMeal) {
            return payment;
        }
        money = money + costOfHeartyMeal;
        heartyMeals++;
        return payment - costOfHeartyMeal;

    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < costOfAffordableMeal) {
            return false;
        }
        card.takeMoney(costOfAffordableMeal);
        affordableMeals++;
        return true;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < costOfHeartyMeal) {
            return false;
        }
        card.takeMoney(costOfHeartyMeal);
        heartyMeals++;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            money = money + sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
