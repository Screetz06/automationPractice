package base;


import pages.loginUserLocators;

public class PageInitializer extends Base {

	protected static loginUserLocators loginUserLocators;


	public static void initializeAllPage() {

		loginUserLocators= new loginUserLocators();
		
	}

}
