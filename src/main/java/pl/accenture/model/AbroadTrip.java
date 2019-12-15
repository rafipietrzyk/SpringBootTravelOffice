package pl.accenture.model;

public class AbroadTrip extends Trip {

    public double insurance;

    public AbroadTrip(){

    }

    public AbroadTrip(String destination, MyDate start, MyDate end) {

        super(destination, start, end);
    }

    public void setInsurance(double insurance) {

        this.insurance = insurance;
    }

    @Override
    public double getPrice() {

        return super.getPrice()+insurance;
    }
}
