package Refactoring;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer); // Cabeçalho
        Enumeration<Rental> rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += rentalString(each); // Detalhes de cada locação
        }
        result += footerString(aCustomer); // Rodapé
        return result;
    }

    protected abstract String headerString(Customer aCustomer);

    protected abstract String rentalString(Rental aRental);

    protected abstract String footerString(Customer aCustomer);
}
