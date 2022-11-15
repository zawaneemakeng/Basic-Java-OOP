package CaffCake;

import java.util.*;
import java.text.SimpleDateFormat;

public class Menu {

    protected String menuName;
    protected double price;
    protected int amount;

    public Menu(String m, double p, int a) {
        menuName = m;
        price = p;
        amount = a;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public double getTotal() {
        return price * amount;
    }

    public String printBill(String name, String phoneNum) {
        Date date = new Date();
        String bill = """
                =======================================\n
                -----------CAFE-CAKE-BOX---------------\n
                =======================================\n""" +
                "\nDue Date :" + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date) + "\nName : "
                + name + "\nContact : " + phoneNum + "\n\nMenu \t\t\t\t" + "Price\n\n" + menuName
                + "\t\t\t" + price
                + "\n\nAmout:\t\t\t\t" + amount + "\n\nToTal\t\t\t\t" + getTotal()
                + " Baht\n\n----------------THANK-YOU---------------\n";
        SaveData b = new SaveData(bill);
        {
            b.saveData(bill);
        }

        return bill;
    }
}
