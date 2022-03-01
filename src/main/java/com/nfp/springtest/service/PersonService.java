/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nfp.springtest.service;

import com.nfp.springtest.domain.Person;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public interface PersonService {

    public List<Person> personsList();

    public void save(Person person);

    public void delete(Person person);

    public Person findPerson(Person persona);

}
