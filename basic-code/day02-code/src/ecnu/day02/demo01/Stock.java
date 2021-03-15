package ecnu.day02.demo01;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double lastSecondPrice;
    double currentPrice;

    //无参数的构造方法
    Stock(){

    }

    //包含所有属性当参数的构造方法
    Stock(String symbol, String name,double previousClosingPrice,double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.currentPrice=currentPrice;
        this.previousClosingPrice=previousClosingPrice;
    }


    //所有属性的Getters和Setters方法
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public boolean setCurrentPrice(double currentPrice) {
        if(currentPrice<0){
            System.out.println("Broken");
            return false;
        }
        this.lastSecondPrice=this.currentPrice;
        this.currentPrice=currentPrice;
        return true;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice=previousClosingPrice;

    }

    public double getLastSecondPrice() {
        return lastSecondPrice;
    }

    public void setLastSecondPrice(double lastSecondPrice) {
        this.lastSecondPrice = lastSecondPrice;
    }

    public void printSecond(){
        System.out.println(name+"上一秒价格为："+lastSecondPrice);
        System.out.println(name+"当前价格为："+currentPrice);
        System.out.println(toString(lastSecondPrice));
        System.out.println("--------------------");
    }
    public void printDay(){
        System.out.println(name+"昨天价格为："+previousClosingPrice);
        System.out.println(name+"当前价格为："+currentPrice);
        System.out.println(toString(previousClosingPrice));
        System.out.println("--------------------");
    }
    //object为所有类的父类（在后期学到），这里指覆盖（重写）父类（类名为）toString的这个方法
    //在方法体里写了得到价格变化比例的算式
    public String toString(double pastPrice) {
        double i=(currentPrice-pastPrice)/pastPrice;
        return "价格变化比例为："+(i*100)+"%";

    }
}
