package absractasinterface;

public abstract class MainClass {
	public static void main(String[] args) {

		MyAbstract obj = new MyAbstract() {
			public void checkInternetStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out.println("The status of internet is: " + status);
			}

			public void checkWifiStatus(boolean status) {
				// TODO Auto-generated method stub

			}
		};
		new InternetConnectiivty(obj).thr.start();

	}

}
