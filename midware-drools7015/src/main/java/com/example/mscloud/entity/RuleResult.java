package com.example.mscloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RuleResult {
    private boolean postCodeResult = false;
    public boolean isPostCodeResult(){
        return this.postCodeResult;
    }
}
