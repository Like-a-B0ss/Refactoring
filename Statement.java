package Refactoring;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer); // Chama o método abstrato para o cabeçalho
        Enumeration<Rental> rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // Adiciona detalhes de cada locação
            result += rentalString(each); // Chama o método abstrato para detalhes
        }
        // Adiciona rodapé
        result += footerString(aCustomer); // Chama o método abstrato para o rodapé
        return result;
    }

    protected abstract String headerString(Customer aCustomer);

    protected abstract String rentalString(Rental aRental);

    protected abstract String footerString(Customer aCustomer);
}
