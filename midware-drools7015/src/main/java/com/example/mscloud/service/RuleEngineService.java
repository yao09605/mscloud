package com.example.mscloud.service;

import com.example.mscloud.entity.QueryParam;

public interface RuleEngineService {
    void executeAddRule(QueryParam queryParam);
    void executeRemoveRule(QueryParam queryParam);
}
