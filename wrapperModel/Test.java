package wrapperModel;

public class Test {
	public static void main(String[] args) {
		Cook cook0 = new WashHairCook(new ChinestCook());
		cook0.cookDinner();
		
		Cook cook1 = new WashHandsCook(new ChinestCook());
		cook1.cookDinner();
		
	}

}
