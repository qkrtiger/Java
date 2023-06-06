package com.dao;

import com.dto.MemberDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    //DB 연동에 필요한 정보
    private String drv = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/jdbc_db";
    private String dbuser = "dbuser";
    private String dbpass = "12341234";

    //DB 연동관련 객체
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    //드라이버 로드 -> 생성자로 처리
    public MemberDao(){
        try {
            Class.forName(drv);
        } catch (ClassNotFoundException e) {}
    }//생성자 끝

    //메모리 해제용 메소드
    public void close(){
        try {
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {}
    }

    public void insertMember(MemberDto member)
            throws SQLException {
        //SQL 쿼리문 작성
        String query = "INSERT INTO usertbl " +
                "VALUES (?,?,?,?,?)";

        conn = DriverManager
                .getConnection(url, dbuser,dbpass);
        pstmt = conn.prepareStatement(query);
        //query의 ? 부분 채우기
        pstmt.setString(1, member.getUid());
        pstmt.setString(2, member.getUpass());
        pstmt.setString(3, member.getUname());
        pstmt.setInt(4, member.getUage());
        pstmt.setString(5, member.getUaddr());
        //완성된 query문 실행
        pstmt.executeUpdate();
        //insert, update, delete 실행은 executeUpdate()로.
    }

    public List<MemberDto> getList()
            throws SQLException{
        List<MemberDto> mList = null;

        String query = "SELECT * FROM usertbl";

        conn = DriverManager
                .getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();

        while (rs.next()){
            //list가 없으면 list를 만들어서 사용.
            if(mList == null){
                mList = new ArrayList<>();
            }

            //한 행을 담을 수 있는 공간(Dto) 생성
            MemberDto md = new MemberDto();
            md.setUid(rs.getString(1));
            md.setUpass(rs.getString(2));
            md.setUname(rs.getString(3));
            md.setUage(rs.getInt(4));
            md.setUaddr(rs.getString(5));

            //dto -> list
            mList.add(md);
        }

        return mList;//null 이거나 목록이거나.
    }

    public MemberDto selectMember(String id)
            throws SQLException{
        MemberDto member = null;

        String query = "SELECT * FROM usertbl " +
                "WHERE uid = ?";

        conn = DriverManager
                .getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        //정보가 있거나 없거나. 그래서 if문으로 처리
        if(rs.next()){
            member = new MemberDto();
            member.setUid(rs.getString(1));
            member.setUname(rs.getString(3));
            member.setUage(rs.getInt(4));
            member.setUaddr(rs.getString(5));
        }

        return member;//null이거나 한명의 정보이거나.
    }

    public void updateMember(MemberDto member)
            throws SQLException {
        String query = "UPDATE usertbl "
                + "SET uname=?, uage=?, uaddr=? "
                + "WHERE uid=?";

        conn = DriverManager
                .getConnection(url, dbuser, dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, member.getUname());
        pstmt.setInt(2, member.getUage());
        pstmt.setString(3, member.getUaddr());
        pstmt.setString(4, member.getUid());

        pstmt.executeUpdate();
    }

    public void deleteMember(String uid)
            throws SQLException {
        String query = "DELETE FROM usertbl " +
                "WHERE uid=?";

        conn = DriverManager
                .getConnection(url,dbuser,dbpass);
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, uid);

        pstmt.executeUpdate();
    }
}//class end
