package com.example.viktor.mma;

import java.util.ArrayList;

/**
 * Created by Viktor on 04-05-2016.
 */
public class SaveClass {

    //This class shall implement the Singleton Design pattern
    private static double moneySpent;
    private static int counter=-1;
    private static ArrayList<String> shoppingListContainer = new ArrayList<String>();
    private static ArrayList<Boolean> plannedarray = new ArrayList<Boolean>();
    private static ArrayList<Boolean> nicearray = new ArrayList<Boolean>();
    private static ArrayList<Double> pricearray = new ArrayList<Double>();
    private static boolean camefromnewexpense = false;
    private static double checkoutprice;


    public static void SetMoneySpent(double newxpense) {
        moneySpent += newxpense;
    }
    public static double GetMoneySpent() {
        return moneySpent;
    }
    public static void CountUp() {
        counter++;
    }
    public static void CountDown() {
        counter--;
    }
    public static void CountClear() {
        counter = 0;
    }
    public static int GetCounter() {
        return counter;
    }
    public static void SetShoppingListContainer(String item) {
        shoppingListContainer.add(item);
    }
    public static ArrayList<String> GetShoppingListContainer() {
        return shoppingListContainer;
    }
    public static void setCamefromnewexpense(boolean b){
        camefromnewexpense=b;
    }
    public static boolean getCamefromnewexpense(){
        return camefromnewexpense;
    }
    public static void setNicearray(boolean b){
        nicearray.add(b);
    }
    public static ArrayList<Boolean> getNicearray(){
        return nicearray;
    }

    public static void setPlannedarray(boolean b){
        plannedarray.add(b);
    }
    public static ArrayList<Boolean> getPlannedarray(){
        return plannedarray;
    }
    public static void setPricearray(double i){
        pricearray.add(i);
    }
    public static ArrayList<Double> getPricearray(){
        return pricearray;
    }
    public static void setCheckOutPrice(double d){
        checkoutprice+=d;
    }
    public static double getCheckoutprice(){
        return checkoutprice;
    }

}
