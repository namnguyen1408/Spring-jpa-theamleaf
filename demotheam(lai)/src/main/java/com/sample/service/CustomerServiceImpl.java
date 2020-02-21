package com.sample.service;

import com.sample.model.Customer;
import com.sample.responsitory.CustomerResponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired //giúp gọi đối tượng customerrepository đx đc khai báo @Bean trên applicationConfig
    private CustomerResponsitory customerResponsitory;

    @Override
    public List<Customer> findAll() {
       return customerResponsitory.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {
    customerResponsitory.save(customer);
    }

    @Override
    public void remove(Long id) {

    }
}
