package machine;

public class CoffeeMaker {
    int money;
    int water;
    int milk;
    int coffeeBeans;
    int cups;

    public CoffeeMaker(int money, int water, int milk, int coffeeBeans, int cups) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public CoffeeMaker setMoney(int money) {
        this.money = money;
        return this;
    }

    public int getWater() {
        return water;
    }

    public CoffeeMaker setWater(int water) {
        this.water = water;
        return this;
    }

    public int getMilk() {
        return milk;
    }

    public CoffeeMaker setMilk(int milk) {
        this.milk = milk;
        return this;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public CoffeeMaker setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
        return this;
    }

    public int getCups() {
        return cups;
    }

    public CoffeeMaker setCups(int cups) {
        this.cups = cups;
        return this;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                this.water+" ml of water\n"+
                this.milk+" ml of milk\n"+
                this.coffeeBeans+" g of coffee beans\n"+
                this.cups+" disposable cups\n$"+
                this.money+" of money";
    }
}
