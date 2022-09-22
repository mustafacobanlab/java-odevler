package intro2;

public class main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image.jpg");
		

		Product product2 = new Product();
		
		product2.setName("Fakir Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		
		product3.setName("Siemens Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
			for (Product product : products) {
				System.out.println("<li>" +product.getName()+ "</li>");
			}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("535353535");
		individualCustomer.setCostomerNumberString("4654564");
		individualCustomer.setFirstName("Mustafa");
		individualCustomer.setLastName("Coban");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyNameString("CobanLab");
		corporateCustomer.setPhone("4440444");
		corporateCustomer.setTaxNumber("154545454");
		corporateCustomer.setCostomerNumberString("5656");
		
		customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
