package pl.accenture.repository;

import org.springframework.stereotype.Repository;
import pl.accenture.exception.MyException;
import pl.accenture.model.Adress;
import pl.accenture.model.Customer;
import pl.accenture.model.MyDate;
import pl.accenture.model.Trip;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TravelOffice {

    MyDate start = new MyDate(2019, 11, 15);
    MyDate end = new MyDate(2019, 12, 23);

    Adress adress = new Adress("Techniczna", "43-765", "Lodz");
    Adress adress1 = new Adress("Paderewskiego", "98-321", "Warszawa");

    Trip trip = new Trip("Tunezja", start, end);
    Trip trip2 = new Trip("Egipt", start, end);

    Customer customer = new Customer(1,"Eryk", adress, trip);
    Customer customer2 = new Customer(2,"Dorota", adress1, trip2);

    Map<Long, Customer> mapCustomer = new HashMap<>();
    {
        mapCustomer.put(customer.getId(), customer);
        mapCustomer.put(customer2.getId(), customer2);
    }

    public Map<Long, Customer> getAllCustomer() throws MyException
    {
        return mapCustomer;
        //throw new MyException();
    }

    public void addCustomer(Customer customer) throws MyException
    {
        mapCustomer.put(customer.getId(),customer);
        //throw new MyException();
    }
}

