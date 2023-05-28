
public class CustomerFactory {
	public Customer choose(String input) {
		if(input.equalsIgnoreCase("RC")) {
			return new RegularCustomer();
		}
		else if(input.equalsIgnoreCase("SC")) {
			return new SeniorCitizenCustomer();
		}
		else if(input.equalsIgnoreCase("FTC")) {
			return new FirstTimeCustomer();
		}
		else return null;
	}
}
