package com.magizhchi.nigazhchi.common.model.dbvo;

import java.io.Serializable;

public class CurrencyDBVO implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = 9163639856097424384L;

  private String _id;
  
  private String currencyName;

  public String getId() {
    return _id;
  }

  public String getCurrencyName() {
    return currencyName;
  }


}
