package com.oracle.dbcs.repository;

import com.oracle.dbcs.bean.Customer;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    List<Customer> findAll();
    Customer findById(String id);

    Customer findByEmail(String email);

    Customer findByIdAndEmail(String id, String email);

    Customer findByIdOrEmail(String id, String email);

    Integer deleteById(String id);

    Integer deleteByIdAndName(String id, String name);

//    @Transactional
//    @Modifying
//    @Query(value = "delete from customer where name IN " + "(:names)", nativeQuery = true)
//    Integer deleteAllByName(List<String> names);
//
//
//    @Query(value ="update customer set name=:customer.getName()", nativeQuery = true)
//    Integer updateByIdAndName(Customer customer);


//    @Query("SELECT email from customer where name = :name")
//    String findByName(String name);

    Boolean existsByName(String name);

}
