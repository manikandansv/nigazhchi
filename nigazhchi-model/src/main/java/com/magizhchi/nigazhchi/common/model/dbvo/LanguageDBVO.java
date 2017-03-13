package com.magizhchi.nigazhchi.common.model.dbvo;

import java.io.Serializable;

public class LanguageDBVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3629754236589358241L;
  
  private String _id;

  private String languageName;

  public String getId() {
    return _id;
  }

  public String getLanguageName() {
    return languageName;
  }



}
