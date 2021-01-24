package com.example.mscloud.controller;



import com.alibaba.fastjson.JSON;
import com.example.mscloud.entity.LoggerEntity;

import org.apache.commons.beanutils.BasicDynaBean;
import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
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
        Object obj=getTarget(entity,addProperties);

        System.out.println("obj3:"+obj);
        //System.out.println(getTarget(entity, addProperties));
    }

    @RequestMapping("/bean2")
    public void dynamicBean2() throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        DynaProperty[] dynaProperties = new DynaProperty[]
                { new DynaProperty("name", String.class),
                        new DynaProperty("age", Integer.class) };
        BasicDynaClass basicDynaClass = new BasicDynaClass("person",
                BasicDynaBean.class, dynaProperties);
        DynaBean personBean = basicDynaClass.newInstance();
        personBean.set("name", "zhangming");
        personBean.set("age", 123);
        System.out.println("-----------");
        System.out.println(personBean.get("name"));
        System.out.println(personBean.get("age"));
        System.out.println("......");
        System.out.println(PropertyUtils.getSimpleProperty(personBean, "name"));
    }
}
