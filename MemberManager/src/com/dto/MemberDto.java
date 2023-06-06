package com.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String uid;
    private String upass;
    private String uname;
    private int uage;
    private String uaddr;

    @Override
    public String toString(){
        return "ID : " + uid + "\n"
                + "NAME : " + uname + "\n"
                + "AGE : " + uage + "\n"
                + "ADDRESS : " + uaddr;
    }
}