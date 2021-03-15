package ecnu.day01.demo01;

import java.util.Scanner;
/*
    字符串中包括大写字母、小写字母、数字、特殊符号
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int BigAlphabet=0,LittleAlphabet=0,digit=0,Special=0;
        for(char i:chars){
            if(i>='A' && i<='Z'){
                BigAlphabet++;
            }else if(i>='a' && i<='z'){
                LittleAlphabet++;
            }else if(i>='0' && i<='9'){
                digit++;
            }else {
                Special++;
            }
        }
        System.out.println("BigAlphabet:"+BigAlphabet);
        System.out.println("LittleAlphabet:"+LittleAlphabet);
        System.out.println("digit:"+digit);
        System.out.println("Special:"+Special);
    }

}
