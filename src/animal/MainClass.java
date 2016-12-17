package animal;
public class MainClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		dog.makeNoise();
		cow.makeNoise();
		dog.eat("shit");

		AbstractClass freak = new Dog();
		AbstractClass freakshow = new Cow();
		freak.eat("junk");
		freakshow.makeNoise();
	}

}
