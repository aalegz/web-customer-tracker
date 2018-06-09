package com.aalegz.springdemo.dao;

import com.aalegz.springdemo.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    //need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Customer> getCustomers() {

        //get the current hibernate session

        //create query

        //execute query and get result list

        //return the results

        return null;
    }
}
