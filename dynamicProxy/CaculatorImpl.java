package dynamicProxy;

public class CaculatorImpl implements Caculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int delete(int a, int b) {

		return a - b;
	}

}
