package d3_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("sdgf");
        c.add("sd");
        c.add("sergf");
        c.add("3wqer");

        //迭代器遍历
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }

        System.out.println("--------------");

        //增强for循环来遍历集合
        for(String ele:c){
            System.out.println(ele);
        }

        System.out.println("----------------");

        //lambda表达式遍历集合，调用forEach方法
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //简化版本
        c.forEach((String s)-> {
                System.out.println(s);
        });

    }
}
