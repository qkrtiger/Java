package com.controller;


import com.dto.PokeDto;
import com.service.PokeService;
import com.view.PokeView;

import java.util.List;

public class PokeController {
    //화면처리
    private PokeView pView = new PokeView();
    //서비스
    private PokeService pServ = new PokeService();

    //프로그램 전체 제어
    public void run(){
        //메뉴 저장 변수
        int m = -1;

        //타이틀
        pView.mainTitle("포켓몬 도감");

        while(true){
            m = pView.showMenu(1);

            //프로그램 종료
            if(m ==0){
                pView.prMsg("도감을 닫습니다.");
                break;
            }
            switch (m){
                case 1: //포멧몬 등록
                    inputPoke();
                    break;
                case 2: //도감 열기
                    outputPoke();
                    break;
                case 3: //포켓몬 검색
                    searchPoke();
                    break;
                case 4: //교배 가능 여부
                    break;
                default:
                    pView.prMsg("0-4 숫자만 입력 가능.");
            }
        }
    }

    private void searchPoke() {
        //하위 메뉴1 출력
        int sm = -1;
        while (true){
            sm = pView.showMenu(2);
            if (sm == 0){
                pView.prMsg("상위 메뉴로 돌아갑니다.");
                break;
            }
            //하위메뉴 1 분기
            switch (sm){
                case 1: //이름으로 검색
                    searchName();
                    break;
                case 2: //타입으로 검색
                    searchType();
                    break;
                default:
                    pView.prMsg("0-2번 숫자만 입력 가능.");
            }
        }
    }

    private void searchType() {
        pView.menuTitle("타입으로 검색");

        String searchType = pView.getSearch("타입 : ");

        List<PokeDto> pList = pServ.getPokeType(searchType);

        if(pList != null){
            pView.outputList(pList);
        } else {
            pView.prMsg("해당 포켓몬은 도감에 등록되지 않았습니다.");
            return;
        }

        updateDelete();
    }

    private void searchName() {
        pView.menuTitle("이름으로 검색");

        String searchName = pView.getSearch("이름 : ");

        List<PokeDto> pList = pServ.getPokeName(searchName);

        if(pList != null){
            pView.outputList(pList);
        } else {
            pView.prMsg("해당 포켓몬은 도감에 등록되지 않았습니다.");
            return;
        }

        updateDelete();
    }

    private void updateDelete() {
        //하위메뉴2 출력
        int sm = -1;
        while (true){
            sm = pView.showMenu(3);
            if (sm == 0){
                pView.prMsg("상위 메뉴로 돌아갑니다.");
                break;
            }
            //하위메뉴2 분기
            switch (sm){
                case 1: //수정
                    updatePoke();
                    break;
                case 2: //삭제
                    deletePoke();
                    break;
                default:
                    pView.prMsg("0-2번 숫자만 입력 가능.");
            }
        }
    }

    private void deletePoke() {
        pView.menuTitle("데이터 삭제");

        int searchNum = pView.getSearchNum("등록번호 : ");
        String yn = pView.getSearch("삭제하시겠습니까?(y/n) ");
        yn = yn.toLowerCase();
        String msg = null;

        if(yn.equals("y")){
            //삭제 진행
            msg = pServ.deletePoke(searchNum);
        } else {
            pView.prMsg(msg);
        }
        pView.prMsg(msg);
    }

    private void updatePoke() {
        pView.menuTitle("데이터 수정");

        int searchNum = pView.getSearchNum("등록번호 : ");
        PokeDto poke = pServ.getPokeNum(searchNum);
        pView.updatePoke(poke);
        String msg = pServ.updatePoke(poke);
        pView.prMsg(msg);

    }

    private void outputPoke() {
        pView.menuTitle("도감 열기");

        List<PokeDto> pList = pServ.getList();

        if(pList != null){
            pView.outputList(pList);
        } else {
            pView.prMsg("등록된 포켓몬이 없습니다.");
        }
    }

    private void inputPoke() {
        pView.menuTitle("포켓몬 등록");

        PokeDto poke = new PokeDto();

        pView.inputPoke(poke);

        String msg = pServ.inputPoke(poke);
        pView.prMsg(msg);
    }


}//class
