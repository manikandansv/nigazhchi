package com.magizhchi.nigazhchi.common.model.vo;

import java.io.Serializable;

public class TimezoneVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1428043898803283138L;

  private String _id;
  
  private String timezoneName;

  public String getId() {
    return _id;
  }

  public String getTimezoneName() {
    return timezoneName;
  }
  
}
