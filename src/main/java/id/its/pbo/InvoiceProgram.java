package id.its.pbo;

public class InvoiceProgram {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("001", "Screwdriver", 5, 10.0);
		Invoice invoice2 = new Invoice("002", "Hammer", 2, 15.0);

		System.out.println("Invoice amount for " + invoice1.getPartDescription() + ": " + invoice1.getInvoiceAmount());
		System.out.println("Invoice amount for " + invoice2.getPartDescription() + ": " + invoice2.getInvoiceAmount());
	}

}
