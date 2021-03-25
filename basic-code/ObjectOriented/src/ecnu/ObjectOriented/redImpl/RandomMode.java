package ecnu.ObjectOriented.redImpl;

import ecnu.ObjectOriented.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int x=0;
        Random r = new Random();
        for (int i = 0; i < totalCount-1; i++) {
            x = r.nextInt(totalMoney-totalCount+i+1)+1;//左闭右开
            list.add(x);
            totalMoney -= x;
        }
        list.add(totalMoney);
        return list;
    }
}
