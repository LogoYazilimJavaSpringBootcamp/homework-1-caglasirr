package Services;

import Model.Customer;
import Model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    public List findCustomersContainC(List<Customer> customerList){
        return customerList.stream().filter(it -> it.getFirstName().contains("c") || it.getFirstName().contains("C")).map(it -> it.getFirstName()).
                collect(Collectors.toList());
    }

    public void getAllCustomers(List<Customer> customerList){
        customerList.stream().forEach(System.out::println);
    }
}
