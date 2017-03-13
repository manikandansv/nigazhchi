package com.magizhchi.nigazhchi.common.model.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class CityVO implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -1455315749069808480L;

  private String _id;
  
  private String cityName;
  
  private String state;

  private Timestamp tsLastModified;
  
  public String getId() {
    return _id;
  }

  public String getCityName() {
    return cityName;
  }

  public String getState() {
    return state;
  }

  public Timestamp getTsLastModified() {
    return tsLastModified;
  }
  
  
 
}
