package ecnu.ObjectOriented.redImpl;

import ecnu.ObjectOriented.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode2 implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        Random r = new Random();
        for (int i = 0; i < totalCount-1; i++) {
            int money = 1 + r.nextInt(leftMoney / leftCount * 2);
            list.add(money);
            leftMoney -= money;
            leftCount -= 1;
        }
        list.add(leftMoney);
        return list;
    }
}
