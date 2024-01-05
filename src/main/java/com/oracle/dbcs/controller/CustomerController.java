package com.oracle.dbcs.controller;

import com.oracle.dbcs.bean.Customer;
import com.oracle.dbcs.bean.Topic;
import com.oracle.dbcs.service.CustomerService;
import com.oracle.dbcs.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*@RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
*/
    @RequestMapping(method = RequestMethod.POST, value="/create",
            consumes = "application/json")
    public void addCustomer(@RequestBody Customer customer) {
        System.out.println("Obj " + customer.toString());
        customerService.addCustomer(customer);
    }

//    @RequestMapping(method = RequestMethod.PUT, value="/update",
//            consumes = "application/json")
//    public void updateCustomer(@RequestBody Customer customer) {
//        System.out.println("Obj " + customer.toString());
//        customerService.updateCustomer(customer);
//    }

    @RequestMapping(method = RequestMethod.DELETE, value="/delete",
            consumes = "application/json")
    public void deleteCustomer(@RequestBody Customer customer) {
        System.out.println("Obj " + customer.toString());
        customerService.deleteCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAll",
            consumes = "application/json")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomers();
    }
    @RequestMapping(method = RequestMethod.GET, value="/getOne",
            consumes = "application/json")
    public Customer getCustomer(@RequestBody String id) {
        System.out.println("Obj " + id);
        return customerService.getCustomer(id);
    }

}
