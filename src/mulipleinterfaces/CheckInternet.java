package mulipleinterfaces;

import mulipleinterfaces.InterfaceCollection.InternetInterface;

public class CheckInternet {

	InternetInterface internetCheck;

	public CheckInternet(InternetInterface interntCheck) {
		this.internetCheck = interntCheck;
	}

	Thread thr = new Thread(new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out
						.println("Wait for 2 seconds while we check for internet.");
				Thread.sleep(2000);
				internetCheck.checkInternet(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});

}
