package org.zerock.applicationtest.member;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDTO {
private String member_id;
private String member_pw;
private String name;
private String phone;
private String email1;
private String email2;
private String gender;
private Boolean agree;
private String create_date;
}
