package br.edu.ifpb.padroes.payment;
import java.util.List;
import br.edu.ifpb.padroes.domain.CompoundProperty;
import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

	private CompoundProperty allProperties = new CompoundProperty();

	public CompoundProperty getAllProperties() {
		return allProperties;
	}

	public void addProperty(Property... property) {
		allProperties.add(property);
	}

	public void pay(List<Property> properties) {

		for (Property sale : properties) {
			PaymentProcessor payment = new GovernmentTaxesPayment();
			payment.linkWith(new RealEstatePayment()).linkWith(new PropertyPayment());
			payment.process(sale);
		}
	}

}
