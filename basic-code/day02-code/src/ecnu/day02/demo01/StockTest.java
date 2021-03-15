package ecnu.day02.demo01;

import java.util.Random;
import java.util.Scanner;

public class StockTest {
    public static Random random=new Random();
    //这里创建了一个Stock对象（名为）stock，并调用了Stock的构造有参方法
    //为每个参数分别赋值
    public static Stock stock = new Stock("SUNW", "Sun",100000,100000+random.nextInt(20)-9.5);
    public static void main(String[] args) {

        /*
         *
         * 这里可以用Random类创建一个产生随机数的对象,产生0到100的随机Int型 的数
         * 导入import java.util.Random;这个包（在package语句下面打入这个代码）
         * Random random=new Random();
         * random.nextInt(100);
         * 然后把random.nextInt(100)放入到下面63，
         * 就是当前价的赋值位置就可以产生随机0到100的当前价了
         */
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<365){
            //System.out.println("当前日期："+sc.next());
            if(stock.currentPrice<=100){
                System.out.println("Broken2");
                break;
            }
            if(!Day(stock,stock.currentPrice)){
                break;
            }
            i++;
        }
        System.out.println(i);

    }
    public static boolean Day(Stock stock,double price){
        Random random=new Random();
        int price2 = (int)price;
        int i=0;
        while(i<60){
            try { Thread.sleep (0) ;
            } catch (InterruptedException ie){}
            if(!stock.setCurrentPrice(stock.currentPrice+random.nextInt(price2*2/100)-price2/100*0.997885)){
                return false;
            }
            //stock.printSecond();
            i++;
        }
        stock.printDay();
        stock.setPreviousClosingPrice(stock.currentPrice);
        return true;
    }
}