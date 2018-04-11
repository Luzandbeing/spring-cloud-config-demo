package writeModel;

import writeModel.ZooDefs.OpCode;

public class Test1 {
	
	/**
	 * org.apache.zookeeper.ZooDefs
	 * 可以在一个class类里定义多个interface，用来区分不同的常量区域。
	 * 当我们在一个class类里些很多static final的常量时，可以考虑这种写法，写多个interface定义多个final常量。
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println(ZooDefs.OpCode.create);
		System.out.println(OpCode.delete);
		System.out.println(NameCode.age);
		System.out.println(DateCode.year);
	}

}
