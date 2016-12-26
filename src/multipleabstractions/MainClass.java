package multipleabstractions;

public class MainClass {
	public static void main(String[] args) {

		MyAbstractClasses.InternetAbstract internetAbs = new MyAbstractClasses().new InternetAbstract() {

			public void checkInternetStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out
						.println("Congratulations !!! there is internet status: "
								+ status);
			}
		};
		new InternetChecker(internetAbs).thr.start();

		// now check for wifi status
		MyAbstractClasses.WifiAbstract wifiAbs = new MyAbstractClasses().new WifiAbstract() {

			public void checkWifiStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out.println("Oops !!! No wifi for you fucker.. "
						+ status);
			}
		};
		new WifiChecker(wifiAbs).thr.start();
	}
}
