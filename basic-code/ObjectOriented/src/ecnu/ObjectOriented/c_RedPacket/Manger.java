package ecnu.ObjectOriented.c_RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Manger extends User{
    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> list = new ArrayList<>();
        if(this.getMoney()<totalMoney){
            System.out.println("余额不足");
            return list;
        }

        this.setMoney(this.getMoney()-totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        //剩下的零头放在最后一个红包里
        for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }

    public ArrayList<Integer> RandomSend(int totalMoney, int count){
        ArrayList<Integer> list = new ArrayList<>();
        if(this.getMoney()<totalMoney){
            System.out.println("余额不足");
            return list;
        }

        this.setMoney(this.getMoney()-totalMoney);
        int x=0;
        Random r = new Random();
        for (int i = 0; i < count-1; i++) {
            x = r.nextInt(totalMoney-count+i+1)+1;//左闭右开
            list.add(x);
            totalMoney -= x;
        }
        list.add(totalMoney);
        return list;
    }
}
