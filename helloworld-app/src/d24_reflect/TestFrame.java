package d24_reflect;

import org.junit.Test;

//使用反射技术，设计与i个保存对象的简易版框架
public class TestFrame {
    @Test
    public void save() throws Exception {
        Student s1=new Student("坤坤",20,'男',180,"篮球");
        Theacher t1=new Theacher("波妞",999);

        //需求：把任意对象的字段名和其对应的值等信息，保存到文件中去
        ObjectFram.saveObject(s1);
        ObjectFram.saveObject(t1);
    }
}
