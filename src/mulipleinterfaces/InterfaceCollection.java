package mulipleinterfaces;

public class InterfaceCollection {
	public interface InternetInterface {
		public void checkInternet(boolean status);
	}

	public interface WifiInterface {
		public void checkWifi(boolean status);
	}
}
