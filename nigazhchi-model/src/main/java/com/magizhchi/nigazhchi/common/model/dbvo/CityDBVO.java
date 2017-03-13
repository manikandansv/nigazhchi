package com.magizhchi.nigazhchi.common.model.dbvo;

import java.io.Serializable;

import org.osgi.service.component.ComponentContext;

import com.magizhchi.arch.mongodb.api.MagizhchiMongoModel;
import com.magizhchi.arch.utilities.api.PropertiesUtil;

public class CityDBVO extends MagizhchiMongoModel implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -1455315749069808480L;

  private static final String DEFAULT_COLLECTION_NAME = "cities";

  private static final String COLLECTION_NAME = "collection.name";

  private String collectionName;

  private String cityName;

  private String state;

  public String getCityName() {
    return cityName;
  }

  public String getState() {
    return state;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String getCollectionName() {
    return collectionName;
  }

  @Override
  public String toString() {
    return "CityDBVO [cityName=" + cityName + ", state=" + state + ", id=" + getId() + "]";
  }

  protected void activate(ComponentContext ctx) {
    this.collectionName = PropertiesUtil.toString(ctx.getProperties().get(COLLECTION_NAME), DEFAULT_COLLECTION_NAME);
  }


}
