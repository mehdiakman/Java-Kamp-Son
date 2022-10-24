package oopWithNlayeredApp;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.loging.DatabaseLogger;
import oopWithNlayeredApp.core.loging.FileLogger;
import oopWithNlayeredApp.core.loging.Logger;
import oopWithNlayeredApp.core.loging.MailLogger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr", 9000);
		
		Logger [] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);

	}

}
