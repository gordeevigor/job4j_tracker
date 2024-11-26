package ru.job4j.examprepare.inheritance;

public class IceCreamPlusJamPlusNuts extends IceCreamPlusJam {
    private static final int NUTS_PRICE = 25;

    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return NUTS_PRICE + super.price();
    }

    public static void main(String[] args) {
        IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
        int price = iceCream.price();
        System.out.println(price);
    }
}
