package Refactoring;
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    // Adicionando o método getCharge()
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    // Adicionando o método getFrequentRenterPoints()
    public int getFrequentRenterPoints() {
        if (_movie.getPriceCode() == Movie.NEW_RELEASE && _daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
