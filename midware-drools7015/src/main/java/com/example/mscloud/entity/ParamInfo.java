package com.example.mscloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamInfo {
    private String id;
    private String paramSign;
    private Date createTime;
    private Date updateTime;


}
