package ecnu.ObjectOriented.c_RedPacket;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger m1 = new Manger("dxy",100);

        Number n1 = new Number("cqy",0);
        Number n2 = new Number("c1",0);
        Number n3 = new Number("c2",0);

        m1.show();
        n1.show();
        n2.show();
        n3.show();
        System.out.println("==============");
        ArrayList<Integer> redPacket = m1.send(66,3);
        n1.receive(redPacket);
        n2.receive(redPacket);
        n3.receive(redPacket);
        m1.show();
        n1.show();
        n2.show();
        n3.show();
        System.out.println("==============");
        //手气红包
        redPacket = m1.RandomSend(33,3);
        n1.receive(redPacket);
        n2.receive(redPacket);
        n3.receive(redPacket);
        m1.show();
        n1.show();
        n2.show();
        n3.show();
        System.out.println("==============");

    }
}
