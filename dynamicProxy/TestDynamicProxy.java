package dynamicProxy;

import java.lang.reflect.Proxy;
/*
 * java设计模式之-动态代理
 */
public class TestDynamicProxy {

	public static void main(String[] args) {

		Caculator caculator = new CaculatorImpl();
		LogHandler log = new LogHandler(caculator);
		Caculator proxy = (Caculator) Proxy.newProxyInstance(caculator.getClass().getClassLoader(),
				caculator.getClass().getInterfaces(), log);
//		int result = proxy.add(1, 1);
		int result = proxy.delete(2, 1);
		System.out.println(result);

	}

}
