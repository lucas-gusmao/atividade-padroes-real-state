package br.edu.ifpb.padroes;
import java.util.List;
import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.PaymentService;

public class Main {
	public static void main(String[] args) {

		PaymentService paymentService = new PaymentService();
		paymentService.addProperty(

				new Apartment(100000, "Apartamento construtura", "Rua x"),
				new Bungalow(100000, "Bangal� construtura", "Rua y"),
				new Tenement(100000, "Corti�o construtura", "Rua y")

		);
		List<Property> properties = (List<Property>) paymentService.getAllProperties();
		paymentService.pay(properties);

	}
}
