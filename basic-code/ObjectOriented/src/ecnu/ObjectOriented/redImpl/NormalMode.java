package ecnu.ObjectOriented.redImpl;

import ecnu.ObjectOriented.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        //剩下的零头放在最后一个红包里
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
}
