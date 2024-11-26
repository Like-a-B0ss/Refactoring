package Refactoring;
public class Main {
    public static void main(String[] args) {
        // Criação de objetos de teste
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("Inception", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3); // 3 dias alugados
        Rental rental2 = new Rental(movie2, 4); // 4 dias alugados
        Rental rental3 = new Rental(movie3, 2); // 2 dias alugados

        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Teste do método statement
        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());

    }
}
