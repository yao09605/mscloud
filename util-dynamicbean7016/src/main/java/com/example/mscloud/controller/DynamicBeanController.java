package com.example.mscloud.controller;



import com.alibaba.fastjson.JSON;
import com.example.mscloud.entity.LoggerEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.example.mscloud.service.DynamicBeanService.getTarget;
@RestController
@RequestMapping("/dynamic")
public class DynamicBeanController {
    @RequestMapping("/bean")
    public void dynamicBeanController(){
        LoggerEntity entity = new LoggerEntity();
        entity.setAppName( "appname" );
        entity.setOperator( "add" );
        entity.setResult( "result" );
        entity.setUri( "uri" );
        entity.setMethod( "method" );
        Map<String, Object> addProperties = new HashMap() {{
            put( "hello" , "world" );
            put( "abc" , "123" );
        }};
        System.out.println("entity:"+JSON.toJSONString(entity));
        Object obj = getTarget(entity,addProperties);
        System.out.println("obj:"+JSON.toJSONString(obj));
        System.out.println("obj1:"+obj.getClass());
        System.out.println("obj2:"+obj);
        obj = (LoggerEntity) obj ;
        System.out.println("obj3:"+obj);
        //System.out.println(getTarget(entity, addProperties));
    }
}
