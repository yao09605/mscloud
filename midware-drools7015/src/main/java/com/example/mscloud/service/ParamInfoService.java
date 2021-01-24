package com.example.mscloud.service;

import com.example.mscloud.entity.ParamInfo;

public interface ParamInfoService {
    ParamInfo selectById(String paramId);
    void insertParam(ParamInfo paramInfo);
    void removeById(String paramId);
}
