package d4_Map;

import java.util.*;
import java.util.stream.Stream;

public class MapDemo1 {
    public static void main(String[] args) {
        //1.把80个学生选择的景点都拿到程序中来
        List<String> data=new ArrayList<>();
        String[] selects={"A","B","C","D"};
        Random r=new Random();


        for (int i = 0; i < 80; i++) {
            //每次模拟一个学生选择一个节点，存入到集合中去
            int index=r.nextInt(4);//0，1，2，3
            data.add(selects[index]);
        }
        System.out.println(data);

        //2.开始统计每个景点的投票人数
        //准备一个Map集合
        Map<String,Integer> result=new HashMap<>();

        //3.开始遍历80个景点
        for (String s : data) {
            if(result.containsKey(s)){
                result.put(s,result.get(s)+1);
            }
            else{
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
