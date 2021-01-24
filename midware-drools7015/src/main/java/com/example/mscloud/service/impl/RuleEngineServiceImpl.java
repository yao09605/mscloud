package com.example.mscloud.service.impl;

import com.example.mscloud.config.SpringContextUtil;
import com.example.mscloud.entity.ParamInfo;
import com.example.mscloud.entity.QueryParam;
import com.example.mscloud.service.ParamInfoService;
import com.example.mscloud.service.RuleEngineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class RuleEngineServiceImpl implements RuleEngineService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RuleEngineServiceImpl.class) ;

    @Override
    public void executeAddRule(QueryParam queryParam) {
        LOGGER.info("参数数据:"+queryParam.getParamId()+";"+queryParam.getParamSign());
        ParamInfo paramInfo = new ParamInfo() ;
        paramInfo.setId(queryParam.getParamId());
        paramInfo.setParamSign(queryParam.getParamSign());
        paramInfo.setCreateTime(new Date());
        paramInfo.setUpdateTime(new Date());
        ParamInfoService paramInfoService = (ParamInfoService) SpringContextUtil.getBean("paramInfoService") ;
        paramInfoService.insertParam(paramInfo);

    }

    @Override
    public void executeRemoveRule(QueryParam queryParam) {
        LOGGER.info("参数数据:"+queryParam.getParamId()+";"+queryParam.getParamSign());
        ParamInfoService paramInfoService = (ParamInfoService)SpringContextUtil.getBean("paramInfoService") ;
        ParamInfo paramInfo = paramInfoService.selectById(queryParam.getParamId());
        if (paramInfo != null){

            paramInfoService.removeById(queryParam.getParamId()) ;
        }
    }
}
