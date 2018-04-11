package singletonModel;
/**
 * 懒汉式实例的实现没有考虑线程安全的问题，它是线程不安全的。并发环境下很可能出现多个实例。
 * 第一种方式：在getInstance方法上加同步。
 * @author luz
 *
 */
public class SingletonThreadSafe1 {
	// 构造方法私有化
	private SingletonThreadSafe1() {

	}

	private static SingletonThreadSafe1 single = null;

	// 静态工厂方法
	public static synchronized SingletonThreadSafe1 getInstance() {
		if (single == null) {
			single = new SingletonThreadSafe1();
		}
		return single;
	}
}
