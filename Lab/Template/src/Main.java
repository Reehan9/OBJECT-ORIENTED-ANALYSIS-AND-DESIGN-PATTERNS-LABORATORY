
public class Main {
	public static void main(String args[]) {
		OrderProcessor onlineOrderProcessor = new OnlineOrderProcessor();
		onlineOrderProcessor.processOrder();
		
		OrderProcessor offlineOrderProcessor = new OfflineOrderProcessor();
		offlineOrderProcessor.processOrder();
	}
}