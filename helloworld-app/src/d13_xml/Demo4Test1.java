package d13_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.lang.model.util.Elements;
import java.util.List;

//使用Dom4j解析xml文件
public class Demo4Test1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个Dom4j框架的解析器对象
        SAXReader saxReader = new SAXReader();
        //2.使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document doc=saxReader.read("helloworld-app\\src\\hello.xml");
        //3.从文件对象中解析XML文件的全部数据
        Element root=doc.getRootElement();
        System.out.println(root.getName());
        //4.获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        //5.获取当前元素下的子元素的文本值
        Element people=root.element("people");
        System.out.println(people.getText());

        Element user=root.element("user");
        System.out.println(user.elementText("name"));





    }
}
