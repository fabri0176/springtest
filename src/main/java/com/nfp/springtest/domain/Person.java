package com.nfp.springtest.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Fabricio
 */
@Data
@Entity
@Table(name = "persons")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String first_name;

    @NotEmpty
    private String last_name;
    
    @NotEmpty
    @Email
    private String email;
    
    private String phone;
}
