package course;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program39 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("");
		System.out.println("Pagamento Basico: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f",cr.getInvoice().getTax()));
		System.out.println("Pagamento total: "+ String.format("%.2f",cr.getInvoice().getTotalPayment()));

		sc.close();
	}

}
