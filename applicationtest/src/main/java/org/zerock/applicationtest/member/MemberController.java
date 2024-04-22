package org.zerock.applicationtest.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.zerock.applicationtest.member.MemberDTO;
import org.zerock.applicationtest.member.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@Getter
@Setter
@Log4j2
@ToString
@WebServlet("/join")
public class MemberController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/join.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//memberService service=memberService.INSTANCE;
        //memberService service = new memberService();
        System.out.println(req.getParameter("agree")!=null);
        MemberDTO dto= MemberDTO.builder()
                .member_id(req.getParameter("member_id"))
                .member_pw(req.getParameter("member_pw"))
                .name(req.getParameter("name"))
                .phone(req.getParameter("phone"))
                .email1(req.getParameter("member_id"))
                .email2(req.getParameter("Email2"))
                .gender(req.getParameter("gender").toUpperCase())
                .agree(req.getParameter("agree")!=null)
                .build();

        try {
            MemberService.INSTANCE.addMember(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("/");
//                String member_id = req.getParameter("member_id");
//        String member_pw = req.getParameter("member_pw");
//        String phone = req.getParameter("phone");
//        String gender = req.getParameter("gender");
//        Boolean agree = Boolean.valueOf(req.getParameter("agree"));
//        req.setAttribute("dto",dto);
//        req.getRequestDispatcher("/join.jsp").forward(req,resp);

//
//        try{
//            MemberDTO memberDTO= MemberService.INSTANCE.login(mid,mpw);
//            if(rememberMe){
//                String uuid= UUID.randomUUID().toString();
//                MemberService.INSTANCE.updateUuid(mid,mpw);
//                memberDTO.setUuid(uuid);
//                Cookie rememberCookie=new Cookie("remember-me",uuid);
//                rememberCookie.setMaxAge(60*60*24*7);
//                rememberCookie.setPath("/");
//                resp.addCookie(rememberCookie);
//            }
//            HttpSession session = req.getSession();
//            session.setAttribute("loginInfo", memberDTO);
//            resp.sendRedirect("/todo/list");
//        }catch (Exception e){
//            resp.sendRedirect("/login?result=error");
//        }


    }
}
