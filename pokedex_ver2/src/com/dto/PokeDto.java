package com.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PokeDto {
    private int pokenum;
    private String pokeno;
    private String pokename;
    private String poketype1;
    private String poketype2;
    private String pokeclass;
    private String pokegender;

    @Override
    public String toString(){
        return  "등록번호 : " + pokenum + "\n"
                + "도감번호 : " + pokeno + "\n"
                + "이름 : " + pokename + "\n"
                + "타입1 : " + poketype1 + "\n"
                + "타입2 : " + poketype2 + "\n"
                + "분류 : " + pokeclass + "\n"
                + "성별 : " + pokegender ;
    }

}

