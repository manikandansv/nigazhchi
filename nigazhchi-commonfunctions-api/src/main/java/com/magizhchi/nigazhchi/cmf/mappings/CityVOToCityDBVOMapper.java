package com.magizhchi.nigazhchi.cmf.mappings;

import org.apache.felix.scr.annotations.Activate;
import org.osgi.service.component.ComponentContext;

import com.magizhchi.arch.mapper.api.MappingContext;
import com.magizhchi.arch.mapper.api.VOMapper;
import com.magizhchi.arch.mapper.api.VOMapperUtil;
import com.magizhchi.nigazhchi.common.model.dbvo.CityDBVO;
import com.magizhchi.nigazhchi.common.model.vo.CityVO;

public class CityVOToCityDBVOMapper implements VOMapper<CityVO, CityDBVO>{
  
  private VOMapperUtil<CityVO, CityDBVO, CityVOToCityDBVOMapper> voMapperUtil;
  
  @Activate
  protected void activate(ComponentContext ctx){
    voMapperUtil.addMapping(CityVO.class, CityDBVO.class, this);
  }

  @Override
  public CityDBVO map(CityVO source, MappingContext ctx) {
   
    CityDBVO target = mapCityVO(source, ctx);
    
    return target;
  }

  public CityDBVO mapCityVO(CityVO source, MappingContext ctx) {
   
    CityDBVO target = new CityDBVO();
    
    ctx.putObject(this, source, target);
    
    target.setCityName(source.getCityName());
    
    target.setState(source.getState());
    
    target.setId(source.getId());
    
    return target;
  }

}
