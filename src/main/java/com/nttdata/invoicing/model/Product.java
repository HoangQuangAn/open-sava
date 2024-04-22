package com.nttdata.invoicing.model;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.openxava.annotations.DescriptionsList;

public class Product {

  @ManyToOne( // The reference is persisted as a database relationship
      fetch = FetchType.LAZY, // The reference is loaded on demand
      optional = true) // The reference can have no value
  @DescriptionsList // Thus the reference is displayed using a combo
  Category category; // A regular Java reference
}
