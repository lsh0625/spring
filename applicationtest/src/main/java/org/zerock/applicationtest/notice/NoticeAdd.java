package org.zerock.applicationtest.notice;

import org.zerock.applicationtest.member.MemberDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/notice_add")

public class NoticeAdd extends HttpServlet {
    private NoticeService noticeService = NoticeService.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/notice_add.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NoticeDTO noticeDTO = NoticeDTO.builder()
                .title(req.getParameter("title"))
                .content(req.getParameter("content"))

                .build();

        try{
            noticeService.register(noticeDTO);
        }catch(Exception e){
            e.printStackTrace();
        }
        resp.sendRedirect("/notice_list");
    }
}