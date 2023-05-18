package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int vegPizzaPrice=300;
    public static int nonVegPizzaPrice=400;
    public static int cheesePrice=80;
    public static int vegToppingPrice=70;
    public static int nonVegToppingPrice=120;
    public static int takeawayPrice=20;
    private int myToppingPrice=0;
    private int baseprice=0;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeawayAdded;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.baseprice=isVeg?vegPizzaPrice:nonVegPizzaPrice;
        this.price=0;
        this.bill="";
        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.isTakeawayAdded=false;
        // your code goes here
    }

    public int getPrice(){
        this.price=baseprice;
        if(isCheeseAdded){
            this.price+=cheesePrice;
        }
        if(isToppingsAdded){
            this.price=myToppingPrice;
        }
        if(isTakeawayAdded){
            this.price+=takeawayPrice;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.myToppingPrice=isVeg?vegToppingPrice:nonVegToppingPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){
            isTakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        String bill="Base Price Of The Pizza: "+this.baseprice+"\n";
        if(isCheeseAdded){
            bill+="Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isToppingsAdded){
            bill+="Extra Toppings Added: "+myToppingPrice+"\n";
        }
        if(isTakeawayAdded){
            bill+="Paperbag Added: "+takeawayPrice+"\n";
        }
        bill+="Total Price: "+this.price+"\n";
        this.bill=bill;
        return this.bill;
    }
}
