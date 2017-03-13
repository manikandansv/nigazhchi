package com.magizhchi.nigazhchi.domain.model.dbvo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.bson.types.ObjectId;
import org.jongo.marshall.jackson.oid.MongoId;

public class VenueHallDBVO implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -6811345446096756148L;

  @MongoId
  private ObjectId venueHallId;
  
  private String venueHallCode;
  
  private String venueHallName;
  
  private ObjectId parentVenue;
  
  private String hallType;
  
  private Set<String> eventsUnderTaken;
  
  private Set<String> amenities;
  
  private Set<String> facilities;
  
  private Set<String> rules;

}
