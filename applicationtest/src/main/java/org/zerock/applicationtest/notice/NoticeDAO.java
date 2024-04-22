package org.zerock.applicationtest.notice;



import lombok.Builder;
import lombok.Cleanup;
import org.zerock.applicationtest.ConnectionUtil;
import org.zerock.applicationtest.member.MemberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NoticeDAO {
    public void insert(NoticeDTO dto) throws  Exception{
        String sql="insert into notice (no, title, content, count, create_date) values (?,?,?,?,?)";
        @Cleanup Connection connection= ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,dto.getNo());
        preparedStatement.setString(2,dto.getTitle());
        preparedStatement.setString(3,dto.getContent());
        preparedStatement.setInt(4,dto.getCount());
        preparedStatement.setString(5,dto.getCreate_date());


        preparedStatement.executeUpdate();

    }

    public List<NoticeDTO> selectAll() throws Exception{
        String sql = "SELECT * FROM notice";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = connection.prepareStatement(sql);
        @Cleanup ResultSet resultSet = pstmt.executeQuery();
        List<NoticeDTO> list = new ArrayList<NoticeDTO>();
        while (resultSet.next()) {
            NoticeDTO dto = NoticeDTO.builder()
                    .no(Integer.parseInt(resultSet.getString("no")))
                    .title(resultSet.getString("title"))
                    .content(resultSet.getString("content"))
                    .count(Integer.parseInt(resultSet.getString("count")))
                    .create_date(resultSet.getString("create_date"))

                    .build();
            list.add(dto);
        }
        return list;
    }
}


