package com.example.mscloud.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class LocalPayment {
    @NonNull
    private String id;
    @NonNull
    private String serial;

    public LocalPayment(){
        this.id = "";
        this.serial="";
    }
}
