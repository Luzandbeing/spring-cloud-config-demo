package singletonModel;

/**
 * 第三种方式：使用静态内部类
 * http://www.cnblogs.com/java-my-life/archive/2012/03/31/2425631.html
 * 
 * 
 * @author luz
 *
 */
public class SingletonThreadSafe3 {

	private SingletonThreadSafe3() {
	}

	/**
	 * 类级的内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用的时候才会装载，从而实现了延迟加载。
	 * 
	 * @author luz
	 *
	 */
	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全。
		 */
		private static SingletonThreadSafe3 instance = new SingletonThreadSafe3();
	}

	public static SingletonThreadSafe3 getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * 当getInstance方法第一次被调用的时候，它第一次读取
	 * SingletonHolder.instance，导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静
	 * 态域，从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
	 */
	

}
