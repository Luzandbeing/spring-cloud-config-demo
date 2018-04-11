package singletonModel;

/**
 * 饿汉式单例类：在类初始化时，已经自行实例化。 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 * 由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时，JVM已经隐含地为您执行了同步，这些情况下就不用自己再来进行同步控制了。所以是线程安全的。
 * 
 * @author luz
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
