package com.example.mscloud.dao;

import com.example.mscloud.entity.ParamInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DroolsDao {
    void insertParam(ParamInfo paramInfo);
    ParamInfo selectById(@Param("id")String id);

    void removeById(@Param("id")String id);
}
