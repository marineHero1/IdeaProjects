package ecnu.ObjectOriented.demo05;

import java.util.Date;

public class StudyDate {
    public static void main(String[] args) {
        //借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        Date start = new Date(95,0,1);
        Date end = new Date(95,11,31,23,59,59);
        Date rand = new Date((long)(Math.random()*(end.getTime()-start.getTime()))+start.getTime());
        System.out.println("1995年第一天："+start);
        System.out.println("1995年最后一天："+end);
        System.out.println("1995年中随机的一天:"+rand);
    }
}
