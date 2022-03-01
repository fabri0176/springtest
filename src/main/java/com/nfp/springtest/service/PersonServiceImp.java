/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nfp.springtest.service;

import com.nfp.springtest.dao.IPersonDao;
import com.nfp.springtest.domain.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fabricio
 */
@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private IPersonDao personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> personsList() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
        //Busca si no encuentra lanza nul
        return personDao.findById(person.getId()).orElse(null);
    }

}
