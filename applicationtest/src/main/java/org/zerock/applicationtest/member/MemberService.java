package org.zerock.applicationtest.member;

import java.util.List;

public enum MemberService {
    INSTANCE;
    private MemberDAO dao=new MemberDAO();

    public void addMember(MemberDTO dto) throws Exception{
        dao.insert(dto);

    }
    public MemberDTO login(String mid, String mpw)throws Exception{

        return dao.getWithPassword(mid,mpw);
    }


        public List<MemberDTO> listALL() throws Exception {
            List<MemberDTO> dtoList = dao.selectAll();

            return dtoList;
        }
}
