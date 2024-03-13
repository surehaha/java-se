package d26_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){

        //参数1：用于指定一个类加载器
        //参数2：指定生成的代理长什么样子，也就是有哪些方法
        //参数3：指定生成的代理对象要干什么事情
        Star starProxy=(Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理对象要做的事情
                        if(method.getName().equals("sing")){
                            System.out.println("准备话筒，收钱20万");
                        }else if(method.getName().equals("dance")){
                            System.out.println("准备场地，收钱30万");
                        }
                        return method.invoke(bigStar, args);
                    }
                });
        return starProxy;
    }
}
