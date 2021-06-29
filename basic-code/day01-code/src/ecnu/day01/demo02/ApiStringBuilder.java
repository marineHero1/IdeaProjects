package ecnu.day01.demo02;
//setCharAt(index,'a')
public class ApiStringBuilder {
    public static void main(String[] args) {
        String s = "  hello  world!  ";
        StringBuilder res = new StringBuilder();
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        //字符串split会将中间的空格变成单个空字符串"",此处空字符串为2-1个
        //倒着处理
        int len = strs.length;
        System.out.println(len);
        for(int i=len-1;i>=0;i--){
            if(strs[i].equals("")) continue;
            res.append(strs[i] + " ");
        }
        //处理最后的空格
        System.out.println(res.toString().trim());
        System.out.println(res.reverse().toString().trim());
        System.out.println(res.charAt(0));
    }
}
