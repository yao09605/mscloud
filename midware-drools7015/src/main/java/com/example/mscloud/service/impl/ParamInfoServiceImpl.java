package com.example.mscloud.service.impl;

import com.example.mscloud.dao.DroolsDao;
import com.example.mscloud.entity.ParamInfo;
import com.example.mscloud.service.ParamInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("paramInfoService")
public class ParamInfoServiceImpl implements ParamInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParamInfoServiceImpl.class) ;
    @Resource
    private DroolsDao droolsDao;
    @Override
    public ParamInfo selectById(String paramId) {
        ParamInfo paramInfo = droolsDao.selectById(paramId) ;
        LOGGER.info("ParamInfoServiceImpl-Sign：{}",paramInfo.getParamSign());
        return paramInfo ;
    }

    @Override
    public void insertParam(ParamInfo paramInfo) {
        droolsDao.insertParam(paramInfo);
    }

    @Override
    public void removeById(String paramId) {
        droolsDao.removeById(paramId);
    }
}
