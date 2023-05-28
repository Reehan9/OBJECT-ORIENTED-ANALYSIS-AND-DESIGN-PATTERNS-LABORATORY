public class OfflineOrderProcessor extends OrderProcessor {

	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		System.out.println("Offline Mode - Trying out items in store");
		
	}

	@Override
	protected void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Offline Mode - Paying through cash");

	}

	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Offline Mode - Collecting order at counter");

	}

}
