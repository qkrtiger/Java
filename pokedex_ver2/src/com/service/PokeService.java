package com.service;

import com.dao.PokeDao;
import com.dto.PokeDto;

import java.sql.SQLException;
import java.util.List;

public class PokeService {
    private PokeDao pDao = new PokeDao();

    //회원정보 저장
    public String inputPoke(PokeDto poke){
        //DB처리결과 메시지 저장
        String msg = null;

        //DAO의 insert메소드 사용하여 정보 저장.
        try{
            pDao.insertPoke(poke);
            msg = "등록 성공";
        } catch (SQLException e){
            msg = "등록 실패";
        } finally {
            pDao.close();
        }
        return msg;
    }

    public List<PokeDto> getList(){
        //dap 테이블 내용을 받아오는 메소드 실행
        List<PokeDto> pList = null;
        try{
            pList = pDao.getList();
        } catch (SQLException e) {
        } finally {
            pDao.close();
        }
        return pList;
    }

    public List<PokeDto> getPokeName(String searchName){
        List<PokeDto> pList = null;
        PokeDto poke = null;

        try {
            pList = pDao.selectPokeName(searchName);
        } catch (SQLException e) {
        } finally {
            pDao.close();
        }
        return pList;
    }

    public List<PokeDto> getPokeType(String searchType){
        List<PokeDto> pList = null;
        PokeDto poke = null;

        try {
            pList = pDao.selectPokeType(searchType);
        } catch (SQLException e) {
        } finally {
            pDao.close();
        }
        return pList;
    }



    public String updatePoke(PokeDto poke) {
        String msg = null;

        try{
            pDao.updatePoke(poke);
            msg = "수정 성공";
        } catch (SQLException e) {
            msg = "수정 실패";
        } finally {
            pDao.close();
        }

        return msg;
    }

    public String deletePoke(int pokenum){
        String msg = null;

        try{
            pDao.deletePoke(pokenum);
            msg = "삭제 성공";
        } catch (SQLException e) {
            msg = "삭제 실패";
        } finally {
            pDao.close();
        }
        return msg;
    }


    public PokeDto getPokeNum(int searchNum) {
        PokeDto poke = null;

        try {
            poke = pDao.selectPokeNum(searchNum);
        } catch (SQLException e) {
        } finally {
            pDao.close();
        }
        return poke;
    }
}//class
