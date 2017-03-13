package com.magizhchi.nigazhchi.cmf.basic.atomic.api;

import com.magizhchi.nigazhchi.common.model.dbvo.CityDBVO;
import com.magizhchi.nigazhchi.common.model.vo.CityVO;

public interface CityACS {

  CityDBVO createCity(CityVO cityVO);

  CityDBVO updateCity(CityVO cityVO, CityDBVO cityDBVO);

  void deleteCity(CityDBVO cityDBVO);

  CityDBVO getCity(CityVO cityVO);

}
