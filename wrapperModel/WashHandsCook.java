package wrapperModel;

public class WashHandsCook extends FilterCook{
	
	public WashHandsCook(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void cookDinner() {
		System.out.println("先洗手");
		cook.cookDinner();
	}

}
