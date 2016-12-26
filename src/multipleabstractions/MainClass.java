package multipleabstractions;

import multipleabstractions.MyAbstractClasses.InternetAbstract;
import multipleabstractions.MyAbstractClasses.WifiAbstract;

public class MainClass {
	public static void main(String[] args) {

		InternetAbstract internetAbs = new MyAbstractClasses().new InternetAbstract() {

			public void checkInternetStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out
						.println("Congratulations !!! there is internet status: "
								+ status);
			}
		};
		new InternetChecker(internetAbs).thr.start();

		// now check for wifi status
		WifiAbstract wifiAbs = new MyAbstractClasses().new WifiAbstract() {

			public void checkWifiStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out.println("Oops !!! No wifi for you fucker.. "
						+ status);
			}
		};
		new WifiChecker(wifiAbs).thr.start();
	}
}
