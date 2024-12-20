package Refactoring;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented); // Método abstrato

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão para a maioria dos casos
    }
}
