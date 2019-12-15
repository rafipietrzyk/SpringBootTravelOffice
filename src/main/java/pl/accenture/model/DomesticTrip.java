package pl.accenture.model;

public class DomesticTrip extends Trip {

    private double ownArrivalDiscount;

    public DomesticTrip(){

    }

    public DomesticTrip(String destination, MyDate start, MyDate end) {

        super(destination, start, end);
    }

    public double getOwnArrivalDiscount() {

        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {

        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
