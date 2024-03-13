package d1;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("招标",23);
        System.out.println(s1);

        Student s2=new Student("招标",23);
        System.out.println(s2.equals(s1));
    }
}
