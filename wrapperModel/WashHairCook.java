package wrapperModel;

public class WashHairCook extends FilterCook{
	
	public WashHairCook(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void cookDinner() {
		System.out.println("先洗头");
		cook.cookDinner();
	}

}
