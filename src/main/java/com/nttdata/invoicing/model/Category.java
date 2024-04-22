package com.nttdata.invoicing.model;

import javax.persistence.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

public class Category {
  @Id
  @Hidden
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  @Column(length=32)
  String oid;
}
