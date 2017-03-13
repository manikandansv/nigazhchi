package com.magizhchi.nigazhchi.common.model.vo;

import java.io.Serializable;

public class StateVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -2141012296170188276L;

  private String _id;

  private String stateName;

  private String country;

  public String getId() {
    return _id;
  }

  public String getStateName() {
    return stateName;
  }

  public String getCountry() {
    return country;
  }



}
