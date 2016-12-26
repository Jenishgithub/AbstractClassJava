package multipleabstractions;

import multipleabstractions.MyAbstractClasses.InternetAbstract;

public class InternetChecker {

	InternetAbstract internetAbs;

	public InternetChecker(InternetAbstract abs1) {
		this.internetAbs = abs1;
	}

	Thread thr = new Thread(new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out
						.println("Wait for 2 seconds, we're checking for the internet.");
				Thread.sleep(2000);
				internetAbs.checkInternetStatus(true);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	});

}
