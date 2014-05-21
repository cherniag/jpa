package com.gc.jpa.service;

import com.gc.jpa.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Author: Gennadii Cherniaiev
 * Date: 5/21/2014
 */
@Service
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User user){
        entityManager.persist(user);
    }
}
