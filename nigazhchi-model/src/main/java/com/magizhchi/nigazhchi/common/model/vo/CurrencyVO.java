package com.magizhchi.nigazhchi.common.model.vo;

import java.io.Serializable;

public class CurrencyVO implements Serializable {
  
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
