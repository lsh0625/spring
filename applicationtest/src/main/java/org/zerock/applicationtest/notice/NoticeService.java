package org.zerock.applicationtest.notice;

import org.zerock.applicationtest.member.MemberDAO;
import org.zerock.applicationtest.member.MemberDTO;

import javax.servlet.annotation.WebServlet;


public enum NoticeService {
    INSTANCE;
    private NoticeDAO dao;
    public void register(NoticeDTO dto) throws Exception{
        //TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        //log.info(todoVO);
        dao.insert(dto);
    }
}
