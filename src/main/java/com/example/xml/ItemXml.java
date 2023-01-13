package com.example.xml;

import lombok.Data;
import lombok.experimental.Accessors;

@SuppressWarnings("ALL")
@Data
@Accessors(chain = true)
public class ItemXml {

  private String objname;
  private String idobj;
  private String objcode;
}
