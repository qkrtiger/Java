package com.view;

import com.dto.PokeDto;

import java.util.List;

public class PokeView {
    private  InOutClass ioc = new InOutClass();

    //메인 타이틀
    public void mainTitle(String title){
        ioc.olPrint(
                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣶⣿⣿⣿⣿⣿⣶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀\n" +
                "⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠙⣿⣿⣿⣿⣿⣆⠀⠀\n" +
                "⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⢿⣧⡀⠀⢠⣿⠟⠛⠛⠿⣿⡆⠀\n" +
                "⠀⢰⣿⣿⣿⣿⣿⣿⠿⠟⠋⠉⠁⠀⠀⠀⠀⠀⠙⠿⠿⠟⠋⠀⠀⠀⣠⣿⠇⠀\n" +
                "⠀⢸⣿⣿⡿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣾⠟⠋⠀⠀\n" +
                "⠀⢸⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣴⣾⠿⠛⠉⠀⠀⠀⠀⠀\n" +
                "⠀⠈⢿⣷⣤⣤⣄⣠⣤⣤⣤⣤⣶⣶⣾⠿⠿⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀\n" +
                "⠀⢸⣿⡛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀\n" +
                "⠀⠀⢻⣧⠀⠈⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀\n" +
                "⠀⠀⠈⢿⣧⠀⠀⠀⠀⠀⠀⠉⠙⠛⠻⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀\n" +
                "⠀⠀⠀⠀⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⠟⠀⣠⣾⠟⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠈⠻⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢀⣤⣾⠟⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⣶⣦⣤⣤⣤⣤⣤⣤⣶⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "            === " + title + " ===      ");
    }

    public void menuTitle(String title){
        ioc.tlPrint("=== " + title + " ===");
    }

    public int showMenu(int cNum){
        int menu = -1;
        ioc.tlPrint("");
        ioc.tlPrint("메뉴");

        switch (cNum){
            case 1: //메인메뉴
                ioc.tlPrint("1. 포켓몬 등록");
                ioc.tlPrint("2. 도감 열기");
                ioc.tlPrint("3. 포켓몬 검색");
                ioc.tlPrint("4. 교배 가능 여부");
                ioc.tlPrint("0. 종료");
                break;

            case 2: //하위메뉴1
                ioc.tlPrint("1. 이름으로 검색");
                ioc.tlPrint("2. 타입으로 검색");
                ioc.tlPrint("0. 돌아가기");
                break;

            case 3: //하위메뉴2
                ioc.tlPrint("1. 수정");
                ioc.tlPrint("2. 삭제");
                ioc.tlPrint("0. 돌아가기");
        }
        //메뉴 번호 입력받기
        menu = ioc.inNum("선택 > ");
        return menu;
    }

    public void prMsg(String msg){
        ioc.tlPrint(msg);
    }

    public void inputPoke(PokeDto poke){
        poke.setPokeno(ioc.inStr("도감번호 : "));
        poke.setPokename(ioc.inStr("이름 : "));
        poke.setPoketype1(ioc.inStr("타입1 : "));
        poke.setPoketype2(ioc.inStr("타입2 : "));
        poke.setPokeclass(ioc.inStr("분류 : "));
        poke.setPokegender(ioc.inStr("성별 : "));
    }

    public void outputList(List<PokeDto> pList){
        for(PokeDto p : pList){
            ioc.tlPrint(p.toString());
            ioc.tlPrint("===========================");
        }
    }

    public String getSearch(String s){
        String keyword = ioc.inStr(s);
        ioc.tlPrint("===========================");
        return keyword;
    }

    public int getSearchNum(String s){
        int keyword = ioc.inNum(s);
        ioc.tlPrint("===========================");
        return keyword;
    }

    public void outputPoke(PokeDto poke){
        ioc.tlPrint(poke.toString());
        ioc.tlPrint("===========================");
    }

    public void updatePoke(PokeDto poke){
        menuTitle("데이터 재입력");
        ioc.tlPrint("enter >> 수정하지 않음");

        String str = null;

        str = ioc.inStr("도감번호 : ");
        if(!str.equals("")){
            poke.setPokeno(str);
        }
        str = ioc.inStr("이름 : ");
        if(!str.equals("")){
            poke.setPokename(str);
        }
        str = ioc.inStr("타입1 : ");
        if(!str.equals("")){
            poke.setPoketype1(str);
        }
        str = ioc.inStr("타입2 : ");
        if(!str.equals("")){
            poke.setPoketype2(str);
        }
        str = ioc.inStr("분류 : ");
        if(!str.equals("")){
            poke.setPokeclass(str);
        }
        str = ioc.inStr("성별 : ");
        if(!str.equals("")){
            poke.setPokegender(str);
        }
    }

} //class
