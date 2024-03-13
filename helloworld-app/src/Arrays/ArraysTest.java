package Arrays;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        //掌握对数组的对象进行排序
        Student[] students=new Student[4];
        students[0]=new Student("一号",156,23);
        students[1]=new Student("二号",156,24);
        students[2]=new Student("三号",150,20);
        students[3]=new Student("四号",142,13);

        //对数组进行排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //约定1：认为左边对象大于右边对象请你返回正整数
                //约定2：认为左边对象小于右边对象请你返回负整数
                //约定3：认为左边对象等于右边对象请你返回0
                //按照年龄升序排序
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });

    }
}
