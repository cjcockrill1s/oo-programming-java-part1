
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherAparment) {
        return (this.squareMeters > otherAparment.squareMeters);
    }

    public int priceDifference(Apartment otherApartment) {
        return (Math.abs(this.pricePerSquareMeter * this.squareMeters - otherApartment.pricePerSquareMeter * otherApartment.squareMeters));
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return (this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
    }
}
