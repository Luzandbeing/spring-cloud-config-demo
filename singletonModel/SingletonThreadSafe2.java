package singletonModel;

/**
 * 第二种方式：使用双重检查锁定
 * 
 * @author luz
 *
 */
public class SingletonThreadSafe2 {

	// 构造方法私有化
	private SingletonThreadSafe2() {

	}

	private volatile static SingletonThreadSafe2 single = null;

	// 静态工厂方法
	public static SingletonThreadSafe2 getInstance() {
		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if (single == null) {
			synchronized (SingletonThreadSafe2.class) {
				if (single == null) {
					single = new SingletonThreadSafe2();
				}
			}
		}
		return single;
	}

}
