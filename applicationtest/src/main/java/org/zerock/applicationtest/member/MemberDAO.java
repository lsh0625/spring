package org.zerock.applicationtest.member;

import lombok.Builder;
import lombok.Cleanup;
import org.zerock.applicationtest.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
    public void insert(MemberDTO dto) throws  Exception{
        String sql="insert into member (member_id, member_pw, name, phone, Email1, Email2, gender, agree) values (?,?,?,?,?,?,?,?)";
        @Cleanup Connection connection= ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,dto.getMember_id());
        preparedStatement.setString(2,dto.getMember_pw());
        preparedStatement.setString(3,dto.getName());
        preparedStatement.setString(4,dto.getPhone());
        preparedStatement.setString(5,dto.getEmail1());
        preparedStatement.setString(6,dto.getEmail2());
        preparedStatement.setString(7,dto.getGender());
        preparedStatement.setBoolean(8,dto.getAgree());

        preparedStatement.executeUpdate();

    }
    public MemberDTO getWithPassword(String member_id, String member_pw) throws Exception {
        String query = "select member_id from member where member_id=? and member_pw=?";
        MemberDTO memberDTO = null;


        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, member_id);
        preparedStatement.setString(2, member_pw);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        memberDTO = MemberDTO.builder()
                .member_id(resultSet.getString("member_id"))

                .build();
        return memberDTO;
    }
    public List<MemberDTO> selectAll() throws Exception{
        String sql = "SELECT * FROM member";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = connection.prepareStatement(sql);
        @Cleanup ResultSet resultSet = pstmt.executeQuery();
        List<MemberDTO> list = new ArrayList<MemberDTO>();
        while (resultSet.next()) {
            MemberDTO dto = MemberDTO.builder()
                    .member_id(resultSet.getString("member_id"))
                    .member_pw(resultSet.getString("member_pw"))
                    .name(resultSet.getString("name"))
                    .phone(resultSet.getString("phone"))
                    .email1(resultSet.getString("Email1"))
                    .email2(resultSet.getString("Email2"))
                    .gender(resultSet.getString("gender"))
                    .agree(Boolean.valueOf(resultSet.getString("agree")))
                    .create_date(resultSet.getString("create_date"))
                    .build();
            list.add(dto);
        }
        return list;
    }
}


