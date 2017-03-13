package com.magizhchi.nigazhchi.common.model.dbvo;

import java.io.Serializable;

public class CountryDBVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -5668312185366946102L;

  private String _id;
  
  private String countryName;
  
  private String currency;
  
  private String language;
  
  private String timezone;
  
  private String region;

  public String getId() {
    return _id;
  }

  public String getCountryName() {
    return countryName;
  }

  public String getCurrency() {
    return currency;
  }

  public String getLanguage() {
    return language;
  }

  public String getTimezone() {
    return timezone;
  }

  public String getRegion() {
    return region;
  }
  
  
  
}
