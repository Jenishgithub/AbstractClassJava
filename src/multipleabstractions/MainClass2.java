package multipleabstractions;

public class MainClass2 {

	public static void main(String[] args) {
		MyAbstractClasses.BattiAbstract battiAbs = new MyAbstractClasses().new BattiAbstract() {

			public void checkBattiStatus(boolean status) {
				// TODO Auto-generated method stub
				System.out
						.println("Congratulations !!! aja ghar ma batti cha.");
			}
		};

		new BattiChecker(battiAbs).thr.start();
	}

}
