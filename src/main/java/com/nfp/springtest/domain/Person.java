package com.nfp.springtest.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Fabricio
 */
@Data
@Entity
@Table(name = "persons")
public class Person implements Serializable{
   
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;
}
