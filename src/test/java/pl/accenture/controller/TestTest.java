package pl.accenture.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.accenture.model.Adress;
import pl.accenture.model.Customer;
import pl.accenture.model.MyDate;
import pl.accenture.model.Trip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void  SecondTest() throws Exception {

        Customer customer = FunctionForSecondTest();
        assertNotNull(customer.getTrip().getStart());
        assertEquals(customer.getName(), "Rafal");
    }

    private Customer FunctionForSecondTest() throws Exception {

        Customer customer = getCustomerForTest();
        String postValue = OBJECT_MAPPER.writeValueAsString(customer);
        MvcResult storyResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(postValue))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
        return OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(), Customer.class);
    }

    private Customer getCustomerForTest() {

        Customer customer = new Customer();
        customer.setName("Rafal");
        customer.setAddress(new Adress("Jaracza", "45-967", "Lodz"));
        customer.setTrip(new Trip("London",
                new MyDate(2019, 10, 18), new MyDate(2019, 11, 18)));
        return customer;
    }
}

