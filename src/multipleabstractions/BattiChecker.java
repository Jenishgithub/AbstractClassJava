package multipleabstractions;

public class BattiChecker {

	MyAbstractClasses.BattiAbstract battiaAbs;

	public BattiChecker(MyAbstractClasses.BattiAbstract battiAbs) {
		this.battiaAbs = battiAbs;
	}

	Thread thr = new Thread(new Runnable() {

		public void run() {
			// TODO Auto-generated method stub

			try {
				System.out
						.println("Wait for 2 seconds while we check for batti: ");
				Thread.sleep(2000);
				battiaAbs.checkBattiStatus(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	});
}
