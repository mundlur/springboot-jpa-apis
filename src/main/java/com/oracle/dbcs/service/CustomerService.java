package com.oracle.dbcs.service;

import com.oracle.dbcs.bean.Customer;
import com.oracle.dbcs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        customerRepository.findAll().stream().forEach(System.out ::println);
        return customerRepository.findAll();
    }

//    public Customer getCustomer(String id) {
//        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
//    }
//
    public void addCustomer(Customer customer) {

        customerRepository.save(customer);
    }

//    public void updateCustomer(Customer customer) {
//        customerRepository.updateByIdAndName(customer);
//    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public Customer getCustomer(String id) {

        return customerRepository.findById(id);
    }
//
//    public void updateCustomer(String id, Customer topic) {
//
//    }
}
