package ecnu.day01.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/*
    .containsKey(index)
    .get(index)
    .put(index,value)
    .keySet()
    .values()
    .getOrDefault()
 */
public class ApiHashMap {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2,1,1,1,1,2,3,4,5,3,34,2,3,4,3,2,2,2,2,21,1,13,1,23,43,2,31,123,123,21,312,2,1,1,1,2,2,2,2,2,2,2}));
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(h.containsKey(nums[i])){
                h.get(nums[i])[0]++;//数组索引
                h.get(nums[i])[2] = i;
            }else{
                //三位数组，第一位是数量，第二位是起始位置，第三位是末尾位置
                h.put(nums[i],new int[]{1,i,i});
            }
        }
        int max = 0;
        int res = 50001;
        for(int[] i:h.values()){
            if(i[0]>max){
                max = i[0];
                res = i[2]-i[1]+1;
            }
            if(i[0]==max){
                res = Math.min(i[2]-i[1]+1,res);
            }
        }
        System.out.println(h.keySet().getClass());
        System.out.println(h.values().getClass());
        ArrayList<Integer> list = new ArrayList<>(h.keySet());
        System.out.println(list);
        return res;
    }

    //HashMap按value排序
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        //Collections.sort(list,(a,b)->(map.get(a).equals(map.get(b)?a.compareTo(b):map.get(b) - map.get(a))
        list.sort((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }else{
                return map.get(b) - map.get(a);
            }
        });
        return list.subList(0,k);
    }
}
