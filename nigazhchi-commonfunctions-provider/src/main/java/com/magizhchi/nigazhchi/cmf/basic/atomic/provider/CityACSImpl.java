package com.magizhchi.nigazhchi.cmf.basic.atomic.provider;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

import com.magizhchi.arch.mapper.api.VOMapperUtil;
import com.magizhchi.arch.persistence.api.PersistenceManager;
import com.magizhchi.arch.persistence.api.PersistenceService;
import com.magizhchi.arch.serviceexecution.api.AbstractComponentService;
import com.magizhchi.nigazhchi.cmf.basic.atomic.api.CityACS;
import com.magizhchi.nigazhchi.cmf.mappings.CityVOToCityDBVOMapper;
import com.magizhchi.nigazhchi.common.model.dbvo.CityDBVO;
import com.magizhchi.nigazhchi.common.model.vo.CityVO;

@Component(immediate = true, enabled = true)
@Service(value = CityACS.class)
public class CityACSImpl implements CityACS, AbstractComponentService<CityDBVO> {

  @Reference
  private PersistenceManager<CityDBVO> persistenceManager;

  private PersistenceService<CityDBVO> persistenceService;
  
  private VOMapperUtil<CityVO, CityDBVO, CityVOToCityDBVOMapper> mapperUtil;

  @Activate
  protected void activate(ComponentContext ctx) {
    this.persistenceService = persistenceManager.getPersistenceService(CityDBVO.class);
    if (persistenceService == null){
      // throw exception
    }
  }

  @Override
  public CityDBVO createCity(CityVO cityVO) {
    
    CityDBVO cityDBVO = mapperUtil.map(cityVO, CityDBVO.class);
    
    cityDBVO.setTsLastModified(new Timestamp(new Date().getTime()));
   
    cityDBVO.setTsTimeCreated(new Timestamp(new Date().getTime()));
    
   CityDBVO managedCityDBVO =  persistenceService.create(cityDBVO);
    
    return managedCityDBVO;
  }

  @Override
  public CityDBVO updateCity(CityVO cityVO, CityDBVO cityDBVO) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteCity(CityDBVO cityDBVO) {
    // TODO Auto-generated method stub

  }

  @Override
  public CityDBVO getCity(CityVO cityVO) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PersistenceService<CityDBVO> getPersistenceService() {
    return persistenceManager.getPersistenceService(CityDBVO.class);
  }

}
