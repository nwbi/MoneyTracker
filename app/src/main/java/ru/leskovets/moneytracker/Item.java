package ru.leskovets.moneytracker;

public class Item {
    public static final String TYPE_EXPENSE = "expense";
    public static final String TYPE_INCOME = "income";

    final String name;
    //final String type;
    final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
