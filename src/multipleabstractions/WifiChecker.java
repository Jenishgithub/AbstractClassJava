package multipleabstractions;

import multipleabstractions.MyAbstractClasses.WifiAbstract;

public class WifiChecker {

	WifiAbstract wifiAbs;

	public WifiChecker(WifiAbstract wifiAbs) {
		this.wifiAbs = wifiAbs;
	}

	Thread thr = new Thread(new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
			System.out
					.println("Wait for 2 seconds, we're checking wifi status");
			try {
				Thread.sleep(2000);
				wifiAbs.checkWifiStatus(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});

}
