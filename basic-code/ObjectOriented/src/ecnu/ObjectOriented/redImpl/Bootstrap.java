package ecnu.ObjectOriented.redImpl;

import ecnu.ObjectOriented.red.OpenMode;
import ecnu.ObjectOriented.red.RedPacketFrame;

public class Bootstrap {
    public static void main(String[] args) {
        RedPacketFrame red = new RedPacketFrame("红包title") {
            @Override
            public void setOwnerName(String ownerName) {
                super.setOwnerName(ownerName);
            }

            @Override
            public void setOpenWay(OpenMode openWay) {
                super.setOpenWay(openWay);
            }
        };
        red.setOwnerName("cqy");
        RandomMode2 randomMode = new RandomMode2();
        red.setOpenWay(randomMode);
    }
}
