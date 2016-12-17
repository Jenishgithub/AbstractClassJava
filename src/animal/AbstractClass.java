package animal;
public abstract class AbstractClass {

	public void eat(String food) {
		// do something with food
		System.out.println("Dog can eat " + food + "...");
	}

	public void sleep(int hours) {
		try {
			Thread.sleep(1000 * 60 * 60 * hours);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public abstract void makeNoise();
}
