package com.nttdata.invoicing.model;

import javax.persistence.*;

import org.openxava.annotations.*;

public class Customer {
	@Id  // The number property is the key property. Keys are required by default
    @Column(length=6)  // The column length is used at the UI level and the DB level
    int number;
 
    @Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    String name;
}
