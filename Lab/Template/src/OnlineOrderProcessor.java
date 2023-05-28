

public class OnlineOrderProcessor extends OrderProcessor {

	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		System.out.print("Online mode - Displaying price comparison table");
		displayPriceComparisonTable();

	}

	@Override
	protected void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Online mode - Making netbanking payment");

	}

	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Online mode - Paying for shipping and providing delivery address");
		
	}
	
	private void displayPriceComparisonTable() {
		System.out.println();
		System.out.println("--------------------------------------------------");
        System.out.println("|   Item      |     Price     |    Availability   |");
        System.out.println("--------------------------------------------------");
        System.out.println("|   Item A    |     $10      |      In Stock     |");
        System.out.println("|   Item B    |     $15      |      Out of Stock |");
        System.out.println("|   Item C    |     $20      |      In Stock     |");
        System.out.println("--------------------------------------------------");
        
	}

}
