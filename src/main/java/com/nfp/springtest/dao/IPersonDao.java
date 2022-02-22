package com.nfp.springtest.dao;

import com.nfp.springtest.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fabricio
 */


public interface IPersonDao extends CrudRepository<Person,Long>{
    
}
