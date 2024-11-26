package Refactoring;

public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        return 0; // Será sobrescrito pelas subclasses
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão
    }
}
