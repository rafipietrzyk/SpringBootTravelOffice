package pl.accenture.model;

public class Trip {
    private String destination;
    private MyDate start;
    private MyDate end;
    private double price;

    public Trip(){

    }

    public Trip(String destination, MyDate start, MyDate end) {
        this.destination = destination;
        this.start = start;
        this.end = end;
    }

    public String getDestination() {

        return destination;
    }

    public void setDestination(String destination) {

        this.destination = destination;
    }

    public MyDate getStart() {

        return start;
    }

    public void setStart(MyDate start) {

        this.start = start;
    }

    public MyDate getEnd() {

        return end;
    }

    public void setEnd(MyDate end) {

        this.end = end;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", price=" + getPrice() +
                '}';
    }
}
