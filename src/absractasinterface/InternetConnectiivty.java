package absractasinterface;

public class InternetConnectiivty {

	MyAbstract obj;

	public InternetConnectiivty(MyAbstract obj) {
		this.obj = obj;
	}

	Thread thr = new Thread(new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out
						.println("Wait for 2 seconds, the system is checking for interconnectivity.");
				Thread.sleep(2000);
				obj.checkInternetStatus(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});

}
