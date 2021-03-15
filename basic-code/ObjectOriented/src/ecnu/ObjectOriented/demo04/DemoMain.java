package ecnu.ObjectOriented.demo04;

public class DemoMain {
    public static void main(String[] args) {
        Cumputer cumputer = new Cumputer();//生成电脑
        cumputer.powerOn();

        USB usbMouse = new Mouse();//多态写法，生成鼠标
        cumputer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();//没用多态，生成键盘
        cumputer.useDevice(keyboard);//向上转型为USB

        cumputer.powerOff();
    }
}
