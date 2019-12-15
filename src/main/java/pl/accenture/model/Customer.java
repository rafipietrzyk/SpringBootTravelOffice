package pl.accenture.model;

public class Customer {

    private long id;
    private String name;
    private Adress address;
    private Trip trip;

    public Customer(){

    }

    public Customer(long id, String name, Adress address, Trip trip) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.trip = trip;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Adress getAddress() {

        return address;
    }

    public void setAddress(Adress address) {

        this.address = address;
    }

    public Trip getTrip() {

        return trip;
    }

    public void setTrip(Trip trip) {

        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", trip=" + trip +
                '}';
    }
}
