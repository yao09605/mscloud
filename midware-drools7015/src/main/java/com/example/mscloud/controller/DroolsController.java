package com.example.mscloud.controller;

import com.example.mscloud.entity.QueryParam;
import com.example.mscloud.entity.RuleResult;
import com.example.mscloud.service.RuleEngineService;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/rule")
public class DroolsController {
    @Resource
    private KieSession kieSession;
    @Resource
    private RuleEngineService ruleEngineService;

    @RequestMapping("/param")
    public void param(){
        System.out.println("enter");
        QueryParam queryParam1=new QueryParam();
        queryParam1.setParamId("1");
        queryParam1.setParamSign("+");
        //QueryParam queryParam2 =new QueryParam();
        //queryParam2.setParamId("2");
        //queryParam2.setParamSign("-");
        //入参
        kieSession.insert(queryParam1);
        //kieSession.insert(queryParam2);
        kieSession.insert(ruleEngineService);

        //反参
        RuleResult ruleResult = new RuleResult();
        kieSession.insert(ruleResult);
        try {
            kieSession.fireAllRules(5);
        }catch (Exception e){
            System.out.println(e);
        }
        return;
    }
}
