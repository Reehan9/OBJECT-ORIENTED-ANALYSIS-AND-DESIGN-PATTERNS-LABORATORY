
public class Main {

	public static void main(String[] args) {
		CustomerFactory factory = new CustomerFactory();
		factory.choose("RC").greet();
		factory.choose("SC").greet();
		factory.choose("FTC").greet();
//		factory.choose("nil").greet(); Exception

	}

}
