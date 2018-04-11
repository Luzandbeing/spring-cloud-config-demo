package dynamicProxy;

public class CaculatorProxy implements Caculator {

	private Caculator caculator;

	public CaculatorProxy(Caculator caculator) {
		this.caculator = caculator;
	}

	@Override
	public int add(int a, int b) {
		int result = caculator.add(a, b);
		return result;
	}

	@Override
	public int delete(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
