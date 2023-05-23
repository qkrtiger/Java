package com.dao;

import com.dto.PokeDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokeDao {
    //DB연동 관련 정보
    private String drv =  "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/pokedex";
    private String dbuser = "dbuser";
    public  String dbpass = "951753";

    //DB 연동관련
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    //드라이버 로드 => 생성자
    public PokeDao(){
        try{
            Class.forName(drv);
        } catch (ClassNotFoundException e) { }
    }

    //메모리 해제
    public void close(){
        try{
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {}
    }


    public void insertPoke(PokeDto poke) throws SQLException{
        //쿼리문 작성
        String query = "insert into pokedextbl values(null,?,?,?,?,?,?)";
        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);

        //?채우기
        //pstmt.setString(1, "null");
        pstmt.setString(1, poke.getPokeno());
        pstmt.setString(2, poke.getPokename());
        pstmt.setString(3, poke.getPoketype1());
        pstmt.setString(4, poke.getPoketype2());
        pstmt.setString(5, poke.getPokeclass());
        pstmt.setString(6, poke.getPokegender());

        //완성 쿼리문 실행
        pstmt.executeUpdate();
        //insert, update, delete 등의 실행은 executeUpdate()로
    }

    public List<PokeDto> getList() throws SQLException{
        List<PokeDto> pList = new ArrayList<>();

        String query = "select * from pokedextbl";

        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();

        while(rs.next()){
            //list가 없으면 생성.
            if(pList == null){
                pList = new ArrayList<>();
            }

            //한 행을 담는 공간(Dto) 생성
            PokeDto pd = new PokeDto();
            pd.setPokenum(rs.getInt(1));
            pd.setPokeno(rs.getString(2));
            pd.setPokename(rs.getString(3));
            pd.setPoketype1(rs.getString(4));
            pd.setPoketype2(rs.getString(5));
            pd.setPokeclass(rs.getString(6));
            pd.setPokegender(rs.getString(7));


            //dto => list
            pList.add(pd);
        }
        return pList;
    }

    public List<PokeDto> selectPokeName(String name) throws SQLException{
        List<PokeDto> pList = null;
        PokeDto poke = null;
        String query = "select * from pokedextbl where pokename = ?";
        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, name);
        rs = pstmt.executeQuery();

        //정보가 있으면 ture
        while(rs.next()){
            if(pList == null){
                pList = new ArrayList<>();
            }

            poke = new PokeDto();
            poke.setPokenum(rs.getInt(1));
            poke.setPokeno(rs.getString(2));
            poke.setPokename(rs.getString(3));
            poke.setPoketype1(rs.getString(4));
            poke.setPoketype2(rs.getString(5));
            poke.setPokeclass(rs.getString(6));
            poke.setPokegender(rs.getString(7));
            pList.add(poke);
        }
        return pList;
    }

    public List<PokeDto> selectPokeType(String type) throws SQLException{
        List<PokeDto> pList = null;
        PokeDto poke = null;
        String query = "select * from pokedextbl where poketype1 = ? or poketype2 = ?";
        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, type);
        pstmt.setString(2, type);
        rs = pstmt.executeQuery();

        //정보가 있으면 ture
        while(rs.next()){
            if(pList == null){
                pList = new ArrayList<>();
            }

            poke = new PokeDto();
            poke.setPokenum(rs.getInt(1));
            poke.setPokeno(rs.getString(2));
            poke.setPokename(rs.getString(3));
            poke.setPoketype1(rs.getString(4));
            poke.setPoketype2(rs.getString(5));
            poke.setPokeclass(rs.getString(6));
            poke.setPokegender(rs.getString(7));
            pList.add(poke);

        }
        return pList;
    }

    public void updatePoke(PokeDto poke) throws SQLException{
        String query = "update pokedextbl set pokeno = ?, pokename = ?, poketype1 = ?, poketype2 = ?, " +
                "pokeclass = ?, pokegender = ? where pokenum = ?";

        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, poke.getPokeno());
        pstmt.setString(2, poke.getPokename());
        pstmt.setString(3, poke.getPoketype1());
        pstmt.setString(4, poke.getPoketype2());
        pstmt.setString(5, poke.getPokeclass());
        pstmt.setString(6, poke.getPokegender());
        pstmt.setInt(7, poke.getPokenum());
        pstmt.executeUpdate();
    }

    public void deletePoke(int pokenum) throws SQLException{
        String query = "delete from pokedextbl where pokenum = ?";
        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, pokenum);

        pstmt.executeUpdate();
    }

    public PokeDto selectPokeNum(int searchNum) throws SQLException {
        PokeDto poke = null;
        String query = "select * from pokedextbl where pokenum = ?";
        conn = DriverManager.getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, searchNum);
        rs = pstmt.executeQuery(); // 쿼리문 실행

        //정보가 있으면 ture.
        if(rs.next()){
            poke = new PokeDto();
            poke.setPokenum(rs.getInt(1));
            poke.setPokeno(rs.getString(2));
            poke.setPokename(rs.getString(3));
            poke.setPoketype1(rs.getString(4));
            poke.setPoketype2(rs.getString(5));
            poke.setPokeclass(rs.getString(6));
            poke.setPokegender(rs.getString(7));
        }

        return poke; //null 혹은 한 명의 정보 넘겨줌.
    }


} //class
