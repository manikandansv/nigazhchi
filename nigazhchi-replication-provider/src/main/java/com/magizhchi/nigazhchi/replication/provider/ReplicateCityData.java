package com.magizhchi.nigazhchi.replication.provider;

import org.apache.commons.lang3.StringUtils;
import org.apache.felix.scr.annotations.Property;
import org.osgi.service.component.ComponentContext;

import com.magizhchi.arch.communication.model.MagizhchiInboundRequest;
import com.magizhchi.arch.communication.model.MagizhchiMessage;
import com.magizhchi.arch.serviceexecution.api.AbstractServiceFacade;
import com.magizhchi.arch.utilities.api.PropertiesUtil;

public class ReplicateCityData extends AbstractServiceFacade {

  @Property(name=SVC_INBOUND_REQ_MSG_CODE)
  private String reqMsgCode;

  @Property(name=SVC_OUTBOUND_RESP_MSG_CODE)
  private String respMsgCode;
  
  @Property(name = SVC_NAME)
  private String serviceFacadeName;

  protected void activate(ComponentContext ctx) {
    this.reqMsgCode = PropertiesUtil.toString(ctx.getProperties().get(SVC_INBOUND_REQ_MSG_CODE), StringUtils.EMPTY);
    this.respMsgCode = PropertiesUtil.toString(ctx.getProperties().get(SVC_OUTBOUND_RESP_MSG_CODE), StringUtils.EMPTY);
    this.serviceFacadeName = PropertiesUtil.toString(ctx.getProperties().get(SVC_NAME), StringUtils.EMPTY);
  }

  @Override
  public String getReqMsgCode() {
    return reqMsgCode;
  }

  @Override
  public String getRespMsgCode() {
    return respMsgCode;
  }

  @Override
  public boolean isTransacted() {
    return true;
  }

  @Override
  public boolean needIdempotentProcessing() {
    return false;
  }

  @Override
  public void processRequest(MagizhchiInboundRequest request) {
    // TODO Auto-generated method stub

  }

  @Override
  public MagizhchiMessage getRequestMessage() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MagizhchiMessage getResponseMessage() {
    // TODO Auto-generated method stub
    return null;
  }


}
