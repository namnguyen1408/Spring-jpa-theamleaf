package com.sample.responsitory;

import com.sample.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional


public class CustomerResponsitoryImpl implements CustomerResponsitory {
    @PersistenceContext //tạo và xóa các entity, tìm kiếm entity, truy vấn entity
    private EntityManager entityManager;
    @Override
    public List<Customer> findAll() {
        String query = "select c from Customer c";
        TypedQuery<Customer> customerTypedQuery = entityManager.createQuery(query, Customer.class);
        return customerTypedQuery.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void save(Customer model) {
        if (model.getId() != null) {
            //update
            entityManager.merge(model);
        }else {
            //add new
            entityManager.persist(model);
        }
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void update(Long id, Customer model) {

    }
}
