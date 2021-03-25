package ecnu.ObjectOriented.c_RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Number extends User{
    public Number() {
    }

    public Number(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int getMoney = list.remove(index);
        this.setMoney(this.getMoney()+getMoney);
    }
}
