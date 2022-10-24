package polymprhismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
		
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		// new lemekten yavaş yavaş korkmalıyız çünkü burada artık Database'e bağımlı durumdayız.!
		this.logger.log("Log mesajı");
	}
}
