package Refactoring;

import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals();
        String result = "Rental Record for " + aCustomer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // Mostra os valores desta locação
            result += "\t" + each.getMovie().getTitle() + "\t" +
                      each.getCharge() + "\n";
        }
        // Adiciona linhas finais
        result += "Amount owed is " + aCustomer.getTotalCharge() + "\n";
        result += "You earned " + aCustomer.getTotalFrequentRenterPoints() +
                  " frequent renter points";
        return result;
    }
}
