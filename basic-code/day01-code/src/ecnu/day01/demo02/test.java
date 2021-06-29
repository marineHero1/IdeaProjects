import java.util.*;
public class test {
    public static void main(String[] args) {
        System.out.println(count(5));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1 2 4 8
        Queue<Integer>[] stacks = new LinkedList[10];
        stacks[0] = new LinkedList<>();
        stacks[1] = new LinkedList<>();
        stacks[2] = new LinkedList<>();

        int layer = 1;
        int sum = 0;
        int i=0;
        while(i<n){

            stacks[layer-1].offer(sc.nextInt());
            int x = (int)Math.pow(2,(layer-1));//1 2 4 8
            sum += x;
            if((i+1-sum)%x==0){
                System.out.println(stacks[layer-1]);
                layer+=1;

            }
            i++;
        }

    }
    public static int count(int n){
        int sum=0;
        while(n!=0){
            if(n%10==1){
                sum++;
            }
            n /= 10;
        }
        return sum;
    }
}