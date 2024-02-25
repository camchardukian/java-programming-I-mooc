
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros || (this.euros == compared.euros && this.cents > compared.cents)) {
            return false;
        }
        return true;
    }

    public Money minus(Money decreaser) {
        int tempEuros = this.euros - decreaser.euros;
        int tempCents = this.cents - decreaser.cents;
        System.out.println(tempEuros);
        System.out.println(tempCents);

        if (tempCents < 0) {
            tempEuros--;
            tempCents = 100 - Math.abs(tempCents);
        }
        if (tempEuros < 0) {
            tempEuros = 0;
            tempCents = 0;
        }
        return new Money(tempEuros, tempCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
