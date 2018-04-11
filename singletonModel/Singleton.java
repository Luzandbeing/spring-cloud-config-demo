package singletonModel;

/**
 * 懒汉式单例
 * 
 * @author luz
 * @since 2018-02-02
 */
// 懒汉式单例类，在第一次调用的时候实例化自己（线程不安全）
public class Singleton {
	// 构造方法私有化
	private Singleton() {

	}

	private static Singleton single = null;

	// 静态工厂方法
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}
