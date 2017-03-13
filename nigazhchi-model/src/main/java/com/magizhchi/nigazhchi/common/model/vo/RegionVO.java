package com.magizhchi.nigazhchi.common.model.vo;

import java.io.Serializable;

public class RegionVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3753694998952310122L;

  private String _id;
  
  private String regionName;

  public String getId() {
    return _id;
  }

  public String getRegionName() {
    return regionName;
  }
  
}
