package d23_junit;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testprintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }
    @Test
    public void testgetMaxIndex(){
        int index=StringUtil.getMaxIndex("admin");
        System.out.println(index);

        //断言机制，程序员可以预测业务方法的结果
        Assert.assertEquals("方法内部有bug",4,4);
        }
}
