
public abstract class OrderProcessor {
	public void processOrder ()
	{
		selectItem();
		doPayment();
		doDelivery();
		System.out.println();
	}
	
	protected abstract void selectItem();
	protected abstract void doPayment();
	protected abstract void doDelivery();
}