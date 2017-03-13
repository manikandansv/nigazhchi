package com.magizhchi.nigazhchi.domain.model.dbvo;

import java.io.Serializable;
import java.util.Set;

import org.bson.types.ObjectId;
import org.jongo.marshall.jackson.oid.MongoId;
import org.jongo.marshall.jackson.oid.MongoObjectId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class VenueDBVO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1137858819732111334L;

  @MongoId
  @MongoObjectId
  private ObjectId venueId;

  @JsonProperty
  private String venueCode;

  @JsonProperty
  private String venueName;
  
  @JsonProperty
  private Set<String> venueAmenities;
  
  @JsonProperty
  private Set<String> venueFacilities;
  
  @JsonProperty
  private Set<String> venueRules;

  private VenueAddressDBVO venueAddress;

  public VenueDBVO() {
    super();
  }

  public VenueDBVO(String venueCode, String venueName) {
    super();
    this.venueCode = venueCode;
    this.venueName = venueName;
  }

  @Override
  public String toString() {
    return "Venue [venueCode=" + venueCode + ", venueName=" + venueName + "]";
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((venueCode == null) ? 0 : venueCode.hashCode());
    result = prime * result + ((venueName == null) ? 0 : venueName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VenueDBVO other = (VenueDBVO) obj;
    if (venueCode == null) {
      if (other.venueCode != null) return false;
    } else if (!venueCode.equals(other.venueCode)) return false;
    if (venueName == null) {
      if (other.venueName != null) return false;
    } else if (!venueName.equals(other.venueName)) return false;
    return true;
  }

  public ObjectId getVenueId() {
    return venueId;
  }

  public String getVenueCode() {
    return venueCode;
  }

  public String getVenueName() {
    return venueName;
  }

  public VenueAddressDBVO getVenueAddress() {
    return venueAddress;
  }
  
  public Set<String> getVenueAmenities() {
    return venueAmenities;
  }

  public Set<String> getVenueFacilities() {
    return venueFacilities;
  }

  public Set<String> getVenueRules() {
    return venueRules;
  }

}
