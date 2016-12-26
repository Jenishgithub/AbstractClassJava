package mulipleinterfaces;

import mulipleinterfaces.InterfaceCollection.InternetInterface;

public class MainClass {

	public static void main(String[] args) {

		InternetInterface checkInternet = new InternetInterface() {

			public void checkInternet(boolean status) {
				// TODO Auto-generated method stub
				System.out.println("Congratulations !!! there is internet");
			}
		};

		new CheckInternet(checkInternet).thr.start();

	}

}
