package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		//set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();

		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();

		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05426794444");
		individualCustomer.setCustomerNumber("123454");
		individualCustomer.setFirstName("Semih");
		individualCustomer.setLastName("Yılmaz");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05426795555");
		corporateCustomer.setCustomerNumber("12346");
		corporateCustomer.setCompanyName("Caleofin Incorporated");
		corporateCustomer.setTaxNumber("11111111111");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
	}

}
