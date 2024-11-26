package Refactoring;

import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals();
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
                        "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // Mostra os valores desta locação
            result += each.getMovie().getTitle() + ": " +
                      each.getCharge() + "<BR>\n";
        }
        // Adiciona linhas finais
        result += "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                  aCustomer.getTotalFrequentRenterPoints() +
                  "</EM> frequent renter points<P>";
        return result;
    }
}
