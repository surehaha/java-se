package d4_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String,Integer>map=new LinkedHashMap<>();//有序，不重复，无索引
        map.put("手表",100);
        map.put("手表",200);
        map.put("手机",10);
        map.put("java",50);
        System.out.println(map);

        //遍历集合
        //1.获取map集合的全部键
        Set<String> keys=map.keySet();
        System.out.println(keys);

        //2.遍历全部的键，根据获取其对应的值
        for (String key : keys) {
            //根据键获取对应的值
            int value=map.get(key);
            System.out.println(key+"---->"+value);
        }
    }
}
